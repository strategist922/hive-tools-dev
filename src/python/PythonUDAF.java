package python;
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
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.StandardListObjectInspector;
import org.apache.hadoop.hive.serde2.typeinfo.TypeInfo;
  
public class PythonUDAF extends AbstractGenericUDAFResolver {

  
//函数输入时候的参数
  @Override
  public GenericUDAFEvaluator getEvaluator(TypeInfo[] parameters)
    throws SemanticException {
 
    return new GenericUDAFPythonEvaluator();
  }


  public static class GenericUDAFPythonEvaluator extends GenericUDAFEvaluator {

	ObjectInspector inputOI[];
    ObjectInspector outputOI;
    
    @Override
    public ObjectInspector init(Mode m, ObjectInspector[] parameters)
        throws HiveException {
      
      super.init(m, parameters);
      
      ObjectInspector item_j;
      
      switch (m) {
      case COMPLETE:
    	  //处理输入的 writable 类型
	      inputOI = parameters;
	      outputOI = PrimitiveObjectInspectorFactory.writableStringObjectInspector;
	      return outputOI;
       default:
    	      throw new RuntimeException("cannot support mode : " + m);

      }
    }


    class DummyAgg implements AggregationBuffer {
    	int id = 0;
    }
    
    DummyAgg dummy = new DummyAgg();
    long lastaggid  = -1;
    
    @Override
    public AggregationBuffer getNewAggregationBuffer() throws HiveException {
    	dummy.id++;
        return dummy;
    }
 
    @Override
    public void reset(AggregationBuffer agg) throws HiveException {
    	((DummyAgg)agg).id ++;
    }
    


    @Override
    public void iterate(AggregationBuffer agg, Object[] parameters)
        throws HiveException {
        if (parameters == null) return;
        DummyAgg myagg = (DummyAgg) agg;
        
        boolean isSameGroup = false;
        if (lastaggid == myagg.id) {
        	isSameGroup = true;
        } else {
        	isSameGroup = false;
        	lastaggid = myagg.id;
        }
        
        Object[] actualparameter = new Object[parameters.length];
        for (int i=0; i < parameters.length; i++) {
        	  Object o = ObjectInspectorUtils.copyToStandardObject(parameters[i], 
        			  inputOI[i], ObjectInspectorCopyOption.JAVA); 
        	  actualparameter[i] = o;
        }
        

        
        //输入数据到这一组
        
    }

    @Override
    public Object terminatePartial(AggregationBuffer agg) throws HiveException {
	     return null;
    }

    @Override
    public void merge(AggregationBuffer agg, Object partial)
        throws HiveException {
    }

    @Override
    public Object terminate(AggregationBuffer agg) throws HiveException {
    	 DummyAgg myagg = (DummyAgg) agg;
	     return myagg;
    }
  }

}