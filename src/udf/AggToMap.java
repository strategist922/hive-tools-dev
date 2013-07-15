package udf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector.PrimitiveCategory;
import org.apache.hadoop.hive.serde2.objectinspector.StandardListObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.StandardMapObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.StandardStructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.IntObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorUtils;
import org.apache.hadoop.hive.serde2.typeinfo.TypeInfo;
import org.apache.hadoop.hive.serde2.typeinfo.TypeInfoUtils;

 

@Description(name = "agg2map", value = "_FUNC_(expr) ")
public class AggToMap extends AbstractGenericUDAFResolver {

  
//函数输入时候的参数
  @Override
  public GenericUDAFEvaluator getEvaluator(TypeInfo[] parameters)
    throws SemanticException {
    if (parameters.length != 1) {
      throw new UDFArgumentTypeException(parameters.length - 1,
          "only 2 argument is expected.");
    }
    ObjectInspector oi = TypeInfoUtils.getStandardJavaObjectInspectorFromTypeInfo(parameters[0]);
    if (!ObjectInspectorUtils.compareSupported(oi)) {
      throw new UDFArgumentTypeException(parameters.length - 1,
          "Cannot support comparison of map<> type or complex type containing map<>.");
    } 
    
    return new GenericUDAFMapEvaluator();
  }


  public static class GenericUDAFMapEvaluator extends GenericUDAFEvaluator {

	ObjectInspector inputOI;
	StandardMapObjectInspector mapOI;
	ObjectInspector key_jOI ;
	ObjectInspector value_jOI ;
	
    @Override
    public ObjectInspector init(Mode m, ObjectInspector[] parameters)
        throws HiveException {
      
      super.init(m, parameters);
      
      ObjectInspector itemOI;
      
      switch (m) {
      case PARTIAL1:
    	  //处理输入的 writable 类型
	      inputOI = parameters[0];
	      
	      //处理输出的java类型
	      key_jOI = ObjectInspectorUtils.getStandardObjectInspector(inputOI, ObjectInspectorCopyOption.JAVA);
	      value_jOI = PrimitiveObjectInspectorFactory.getPrimitiveJavaObjectInspector(PrimitiveCategory.INT);
	   
	      return  ObjectInspectorFactory.getStandardMapObjectInspector(key_jOI, value_jOI);
	      
      case FINAL: 
     // 这里的输入OI,受到上面的影响.
    	  mapOI = (StandardMapObjectInspector)(parameters[0]);
    	  
    	  return  ObjectInspectorUtils.getStandardObjectInspector(mapOI, ObjectInspectorCopyOption.JAVA);
    	  
       default:
    	      throw new RuntimeException("cannot konwn mode : " + m);

      }
      
     
    }

   
     class AggMap implements AggregationBuffer {
        Map<Object,Integer> map = new HashMap<Object,Integer>();
        
    	void reset() {
    		if (map != null)
    			map.clear();
    	}
    	 	
    	void insertBatch (Map<Object,Integer> cooked) {
    		if (cooked == null)
    			return;
    		for(Map.Entry<Object,Integer> entry : cooked.entrySet()) {
    			addCount(entry.getKey(), entry.getValue());
    		}
    	}

		public void addCount(Object col, int num) {
			if (map.get(col) != null) {
				num = num + map.get(col) ;
			}
			map.put(col, num);
		}
     }
     
    @Override
    public AggregationBuffer  getNewAggregationBuffer() throws HiveException {
      AggMap result = new AggMap();
      return result;
    }
    

    @Override
    public void reset(AggregationBuffer agg) throws HiveException {
      AggMap myagg = (AggMap) agg;
      myagg.reset();
    }

    boolean warned = false;

    @Override
    public void iterate(AggregationBuffer agg, Object[] parameters) //parameters lazyString被重复利用了
        throws HiveException {
        assert (parameters.length == 2);
        
        if (parameters[0] == null) return;
        
        AggMap myagg = (AggMap) agg;
		
        Object col = ObjectInspectorUtils.copyToStandardObject(parameters[0], inputOI, ObjectInspectorCopyOption.JAVA);
		myagg.addCount(col, 1);
    }

    @Override
    public Object terminatePartial(AggregationBuffer agg) throws HiveException {
    	 AggMap myagg = (AggMap) agg;
    	 return myagg.map;
    }

    @Override
    public void merge(AggregationBuffer agg, Object partial)
        throws HiveException {
        if (partial == null) return;
        
        AggMap myagg = (AggMap) agg;
        
        Map partialmap = (Map) ObjectInspectorUtils.copyToStandardObject(partial, mapOI, 
        		ObjectInspectorCopyOption.JAVA);  
        
        if (partialmap == null || partialmap.size() == 0) {
        	System.out.println("struts == null && struts.size() != 2");
        	return;
        }
        myagg.insertBatch(partialmap); 
      
    }
    
    @Override
    public Object terminate(AggregationBuffer agg) throws HiveException {
	   	 AggMap myagg = (AggMap) agg;
	   	 return myagg.map;
    }
  }

}