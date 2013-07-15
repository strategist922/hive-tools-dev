package udf;
import java.util.ArrayList;
import java.util.List;
import org.apache.hadoop.hive.ql.exec.UDFArgumentTypeException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.parse.SemanticException;
import org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorUtils;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorUtils.ObjectInspectorCopyOption;
import org.apache.hadoop.hive.serde2.objectinspector.StandardListObjectInspector;
import org.apache.hadoop.hive.serde2.typeinfo.TypeInfo;
//把单列聚合成数组输出   to_array(c) 
public class AggToArray extends AbstractGenericUDAFResolver {

  
//函数输入时候的参数
  @Override
  public GenericUDAFEvaluator getEvaluator(TypeInfo[] parameters)
    throws SemanticException {
    if (parameters.length != 1) {
      throw new UDFArgumentTypeException(parameters.length - 1,
          "only 1 argument is expected.");
    }
    return new GenericUDAFAggArrayEvaluator();
  }


  public static class GenericUDAFAggArrayEvaluator extends GenericUDAFEvaluator {

	ObjectInspector inputOI;
    ObjectInspector outputOI;
    
    @Override
    public ObjectInspector init(Mode m, ObjectInspector[] parameters)
        throws HiveException {
      
      super.init(m, parameters);
      
      ObjectInspector item_j;
      
      switch (m) {
      case PARTIAL1:
    	  //处理输入的 writable 类型
	      inputOI = parameters[0];
	      
	      //处理输出的java类型
	      item_j = ObjectInspectorUtils.getStandardObjectInspector(inputOI,
	    		  ObjectInspectorCopyOption.JAVA);
	      outputOI = ObjectInspectorFactory.getStandardListObjectInspector(item_j);
	      
	      return outputOI;
	      
      case FINAL: 
         // 这里的输入OI,受到上面的影响.  处理输入的 writable 类型
    	  StandardListObjectInspector finalinput = (StandardListObjectInspector)(parameters[0]);
    	  inputOI = finalinput;
    	  
    	//处理输出的java类型
     	  outputOI = ObjectInspectorUtils.getStandardObjectInspector(finalinput,
    	          ObjectInspectorCopyOption.JAVA);
    	  
    	  
    	  return outputOI;
    	  
       default:
    	      throw new RuntimeException("cannot konwn mode : " + m);

      }
    }


    class ArrayAgg implements AggregationBuffer {
    	 List<Object> arr = new ArrayList<Object>();
    	 void add(Object obj) {
    		 arr.add(obj);
    	 }
    	 void add(List<Object> arrp) {
    		 arr.addAll(arrp);
    	 }
    	 void reset() {
    		 arr.clear();
    	 }
    }
    
    @Override
    public AggregationBuffer getNewAggregationBuffer() throws HiveException {
      ArrayAgg result = new ArrayAgg();
      return result;
    }
 
    @Override
    public void reset(AggregationBuffer agg) throws HiveException {
    	ArrayAgg myagg = (ArrayAgg) agg;
    	myagg.reset();
    }


    @Override
    public void iterate(AggregationBuffer agg, Object[] parameters) //parameters lazyString被重复利用了
        throws HiveException {
        if (parameters[0] == null) return;
        ArrayAgg myagg = (ArrayAgg) agg;
        Object o = ObjectInspectorUtils.copyToStandardObject(parameters[0], inputOI, ObjectInspectorCopyOption.JAVA); 
        myagg.add(o);
    }

    @Override
    public Object terminatePartial(AggregationBuffer agg) throws HiveException {
    	 ArrayAgg myagg = (ArrayAgg) agg;
	     return myagg.arr;
    }

    @Override
    public void merge(AggregationBuffer agg, Object partial)
        throws HiveException {
        if (partial == null) return;
        
        ArrayAgg myagg = (ArrayAgg) agg;
        List arr_partial = (List) ObjectInspectorUtils.copyToStandardObject(partial, inputOI, ObjectInspectorCopyOption.JAVA);  
        myagg.add(arr_partial);
    }
    
    @Override
    public Object terminate(AggregationBuffer agg) throws HiveException {
    	 ArrayAgg myagg = (ArrayAgg) agg;
	     return myagg.arr;
    }
  }

}