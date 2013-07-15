package udf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDFArgumentTypeException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.parse.SemanticException;
import org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorUtils;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorUtils.ObjectInspectorCopyOption;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.StandardListObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.StandardStructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.IntObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorUtils;
import org.apache.hadoop.hive.serde2.typeinfo.TypeInfo;
import org.apache.hadoop.hive.serde2.typeinfo.TypeInfoUtils;

/*
1, hive取最值的前几个. 除了全排序 order by, 还有分组的row_num排序.
   由于 全排序在reduce的时候进行单机排序.慢
    一般最好使用分组后排序.
     由于取排序后的前几位,没必要全部都排序, 这里开发类似max()聚合函数, 能在map端进行聚合,
     再在reduce在比较.我们只要使用最小堆取前几位即可以. 

2, 设计方案:

   MaxN
使用方法:  maxn( expr, N) .  返回 [expr] 即数组
参数说明:   expr 可以为任意列名, 集合类型, 普通函数.
                  N 可以为常数, 或者组内得出固定数的表达式.
举例:   1, 取价格最高的10条记录  :  maxn(price, 10)
            返回[price, price.....]
            2, 取年纪最高的10个,并取出对应的名字:  maxn(struct(age,  name),  10) , 
            返回[{col1::age, col2:name}, {col1::age, col2:name} ....]
            注意,由于age是数值类型,name是string, 所以不能用array(age, name), 否则age变成string类型,
            比较时候就错误了,比如 '22'岁 和 '9'岁,是9岁更大了.
*/

@Description(name = "maxn", value = "_FUNC_(expr,n) - Returns the maximum n values of expr")
public class MaxN extends AbstractGenericUDAFResolver {

  
//函数输入时候的参数
  @Override
  public GenericUDAFEvaluator getEvaluator(TypeInfo[] parameters)
    throws SemanticException {
    if (parameters.length != 2) {
      throw new UDFArgumentTypeException(parameters.length - 1,
          "only 2 argument is expected.");
    }
    ObjectInspector oi = TypeInfoUtils.getStandardJavaObjectInspectorFromTypeInfo(parameters[0]);
    if (!ObjectInspectorUtils.compareSupported(oi)) {
      throw new UDFArgumentTypeException(parameters.length - 1,
          "Cannot support comparison of map<> type or complex type containing map<>.");
    }
    
    ObjectInspector oi2 = TypeInfoUtils.getStandardJavaObjectInspectorFromTypeInfo(parameters[1]);
    
    if (oi2 instanceof IntObjectInspector == false) {
        throw new UDFArgumentTypeException( 2,
                "the 2nd argment only support the int value");
   }
    
    return new GenericUDAFMaxEvaluator();
  }


  public static class GenericUDAFMaxEvaluator extends GenericUDAFEvaluator {

	ObjectInspector inputOI;
    ObjectInspector numOI;
    ObjectInspector outputOI;
    
    ObjectInspector insertOI;
    ObjectInspector storeOI;
    
    @Override
    public ObjectInspector init(Mode m, ObjectInspector[] parameters)
        throws HiveException {
      
      super.init(m, parameters);
      
      ObjectInspector itemOI;
      
      switch (m) {
      case PARTIAL1:
    	  //处理输入的 writable 类型
	      inputOI = parameters[0];
	      numOI = (PrimitiveObjectInspector)parameters[1] ;
	     // 对应的输出OI,需要使用java对象参数
	      itemOI = ObjectInspectorUtils.getStandardObjectInspector(inputOI,
	          ObjectInspectorCopyOption.JAVA);
	      insertOI = inputOI;
	      storeOI  = itemOI;
//1,取出
	      
	      //处理输出的java类型
	      ObjectInspector numOI_j = ObjectInspectorUtils.getStandardObjectInspector(numOI, ObjectInspectorCopyOption.JAVA);
	      ObjectInspector row_j = ObjectInspectorFactory.getStandardListObjectInspector(itemOI); //2, row元素变成结构体
	      
	      List<String> structFieldNames = new ArrayList<String>(2);
	      structFieldNames.add("max_count");
	      structFieldNames.add("row_data");
	      
	      List<ObjectInspector> structFieldObjectInspectors = new ArrayList<ObjectInspector>(2);
	      structFieldObjectInspectors.add(numOI_j);
	      structFieldObjectInspectors.add(row_j);
	      
	      outputOI = ObjectInspectorFactory.getStandardStructObjectInspector(structFieldNames, structFieldObjectInspectors);
	      
	      return  outputOI;
	      
      case FINAL: 
     // 这里的输入OI,受到上面的影响
        StandardStructObjectInspector finalinput = (StandardStructObjectInspector)(parameters[0]);
    	  inputOI = finalinput;
    	  ObjectInspector row_data = finalinput.getStructFieldRef("row_data").getFieldObjectInspector();
    	  numOI   = finalinput.getStructFieldRef("max_count").getFieldObjectInspector();
    	  
    	  itemOI = ((StandardListObjectInspector)row_data).getListElementObjectInspector();
    	  
    	  outputOI = ObjectInspectorUtils.getStandardObjectInspector(row_data,
    	          ObjectInspectorCopyOption.JAVA);
    	  
    	  insertOI = itemOI; //3, 修改为itemOI中的第一个元素的OI
    	  storeOI = ObjectInspectorUtils.getStandardObjectInspector(itemOI,
    	          ObjectInspectorCopyOption.JAVA);
    	  
    	  return outputOI;
    	  
       default:
    	      throw new RuntimeException("cannot konwn mode : " + m);

      }
      
     
    }

    /** class for storing the current max value heap */
     class MaxAgg implements AggregationBuffer {
    	PriorityQueue<PairObject> queue;
    	int count ;
    	
    	void ini (int count) { 
    			this.count = count;
    			this.queue = new PriorityQueue<PairObject>(count, new Comparator<PairObject>() {
					public int compare(PairObject o1, PairObject o2) {
						return o1.compare(o2);
					}
    			});
    			
    	}

    	void reset() {
    		if (queue != null)
    			queue.clear();
    	}
    	
    	
    	void tryInsert (Object writableObj) {
    		if (queue.size() < count) {
    			Object javaObj = ObjectInspectorUtils.copyToStandardObject(writableObj, insertOI, ObjectInspectorCopyOption.JAVA);
    			PairObject pair = new PairObject();
    			pair.key = javaObj;
    			queue.offer(pair);
    		} else if (ObjectInspectorUtils.compare(queue.peek().key, storeOI, writableObj, insertOI) < 0) {//大于当前最小,加入
    			queue.poll();
    			Object javaObj = ObjectInspectorUtils.copyToStandardObject(writableObj, insertOI, ObjectInspectorCopyOption.JAVA);
    			PairObject pair = new PairObject();
    			pair.key = javaObj;
    			queue.offer(pair);
    		}
    	}
    	

    	
    	List toList() {
    	    if (queue == null) return null;
    	    
    	    Object[] rawArr = new Object[queue.size()];
    		PairObject top = null;
    		int index = queue.size()-1;
    		
    		while((top = queue.poll()) != null) {
    			if (index < 0) throw new RuntimeException("queue 并发读或写异常");
    			rawArr[index] = top.key;  //7,tmp变成数列的数列
    			index--;
			}
    		return Arrays.asList(rawArr);
    	}
    	
    	void insertBatch (List cooked) {
    	  if (cooked == null) return;

    	  for (int i=1; i < cooked.size(); i++) {
    	    Object javaObj = cooked.get(i);
          PairObject pair = new PairObject();
          pair.key = javaObj;
          if (queue.size() < count) {
        	  queue.offer(pair);
          } else if (queue.peek().compare(pair) < 0){
            queue.poll();
            queue.offer(pair);
          }
    	  }
    	}
    }

     class PairObject {
    	Object key;
     	Object value;
    	
    	public int compare(PairObject o2) {
    	   return ObjectInspectorUtils.compare(this.key, storeOI, o2.key, storeOI);
		}	

    }
    
    @Override
    public AggregationBuffer  getNewAggregationBuffer() throws HiveException {
      MaxAgg result = new MaxAgg();
      return result;
    }
    
    
//该分区的操作已经结束了，可以重置该buffer对象。重新利用。
    @Override
    public void reset(AggregationBuffer agg) throws HiveException {
      MaxAgg myagg = (MaxAgg) agg;
      myagg.reset();
    }

    boolean warned = false;

    @Override
    public void iterate(AggregationBuffer agg, Object[] parameters) //parameters lazyString被重复利用了
        throws HiveException {
        assert (parameters.length == 2);
        
        if (parameters[0] == null) return;
        
        MaxAgg myagg = (MaxAgg) agg;
		
		if (myagg.queue == null) {
			int maxcount = PrimitiveObjectInspectorUtils.getInt(parameters[1], (PrimitiveObjectInspector)numOI);
			
			myagg.ini(maxcount);
		}
		
		myagg.tryInsert(parameters[0]);//5, 也插入其他value
    }
// 这里的语义是仅被调用一次是吗?
    @Override
    public Object terminatePartial(AggregationBuffer agg) throws HiveException {
    	 MaxAgg myagg = (MaxAgg) agg;
    	 List queue =  myagg.toList();
    	 int  max_count = myagg.count;
    	 List output = new ArrayList(2);
    	 output.add(max_count);
    	 output.add(queue);
    	 return output;
    }

    @Override
    public void merge(AggregationBuffer agg, Object partial)
        throws HiveException {
        if (partial == null) return;
        
        MaxAgg myagg = (MaxAgg) agg;
        
        List struts = (List) ObjectInspectorUtils.copyToStandardObject(partial, inputOI, ObjectInspectorCopyOption.JAVA); //帮我们复制出ｊａｖａ对象. 这里是deep度取出数据.但是只支持内置的集合对象,基本类型
        						//由于我们规定ｍａｐ阶段输出 struct 即list, 所以这里可以直接转
        
        if (struts == null && struts.size() != 2) {
        	System.out.println("struts == null && struts.size() != 2");
        	return;
        }
        
        if (myagg.queue == null ) {
          int num = (Integer)(struts.get(0));
          myagg.ini(num);
        }
        
        myagg.insertBatch((List)(struts.get(1))); 
      
    }
//在 ReadceTask 每一条 调用. 这里的语义是仅被调用一次是吗?
    @Override
    public Object terminate(AggregationBuffer agg) throws HiveException {
	   	 MaxAgg myagg = (MaxAgg) agg;
	     return myagg.toList();
    }
  }

}