package udf;


import hook.PythonHook;
import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorUtils;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorUtils.ObjectInspectorCopyOption;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.io.Text;
import org.python.core.Py;
import org.python.core.PyCode;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

 
public class Python extends GenericUDF {
  private ObjectInspector funcOI;
  private ObjectInspector[] argsOI;//从1开始
  
  private Text result;
  private PyCode py_fun;
  private PythonInterpreter interp ;
  private int argcount = 0;
  private boolean printcode = true;
  private boolean isSkipNone = false;
  private boolean isTryCatch = false;
  
  @Override
  public ObjectInspector initialize(ObjectInspector[] arguments)
      throws UDFArgumentException {
 
    if (arguments.length < 1) {
      throw new UDFArgumentException(
          "The function py" + " accepts " + 
              " 1 and more arguments. python('code', arguments...)");
    }
    if ("true".equals(System.getProperty(PythonHook.PYTHON_SKIP_NONE)))
    	isSkipNone = true;
    if ("true".equals(System.getProperty(PythonHook.PYTHON_TRY_CATCH)))
    	isTryCatch = true;
    
    funcOI = arguments[0];
    
    argcount = arguments.length - 1;
    
    argsOI = arguments;
   
    result = new Text();
    
    return PrimitiveObjectInspectorFactory.writableStringObjectInspector;
  }


//默认返回字符串先.
  @Override
  public Object evaluate(DeferredObject[] arguments) throws HiveException {
    Object pycode = arguments[0].get();
    
	if (pycode == null)
		return result;
    //ini only one time
    if (interp == null && py_fun == null) { 
    	interp = new PythonInterpreter();
    	
	    String code = ObjectInspectorUtils.copyToStandardObject(pycode, funcOI, ObjectInspectorCopyOption.JAVA).toString();

	    String[] codelines = code.split("\n");
	    if (codelines == null) return result;
	    
	    StringBuilder bu = new StringBuilder();
	    for (int i=0; i < argcount; i++) {
	    	bu.append("col"+(i+1)).append(',');
	    }
	    if (argcount > 0) {
	    	bu.deleteCharAt(bu.length()-1);
	    } else {
	    	bu.append(" ");//avoid null to print
	    }
	    String args = bu.toString();
	    
	    bu.setLength(0);//clear the str buffer
	    
	    bu.append("def adhocfun(").append(args);

	    bu.append("):\n");
	   
	    for (String line : codelines) {
	    	if (! "".equals(line.trim()))
	    	bu.append(" ").append(line).append("\n"); // don't change indent and add the one space char
	    }
	    
	    code = bu.toString();
	    
	    if (printcode) {
	    	System.err.print("python code use : \n\n" + code + "\n\n");
	    	printcode = false;
	    }
	    interp.exec(code); 
	    py_fun = interp.compile("__hive_result__ = adhocfun(" + args + ")");
     }
  	
  	PyObject res = null;
  	
  	for (int i=0; i < argcount; i++) {
  		Object wobj = arguments[i+1].get();
  		Object arg = null; 
  		if (wobj != null)
  			arg = ObjectInspectorUtils.copyToStandardObject(wobj, 
  					argsOI[i+1], ObjectInspectorCopyOption.JAVA);
  		else {
  			if (isSkipNone) return result;
  			arg = Py.None; 
  		}
  			
  		
  	  	 interp.set("col"+(i+1), arg);//设置参数
  	}

  	if (isTryCatch) {
  		try {
  		  	interp.exec(py_fun);
  		  	
  		  	res = interp.get("__hive_result__");
  		  	
  		    result.set(res.toString());
  		    
  		    return result;
  		    
  		} catch (RuntimeException e) {
  			e.printStackTrace();
  			return result;
  		}
  	} else {
  		
  	  	interp.exec(py_fun);
  	  	res = interp.get("__hive_result__");
  	    result.set(res.toString());
  	    return result;
  	}

  }

  @Override
  public String getDisplayString(String[] children) {

    return "py(function,arg1,arg2...)";
  }
  public static void main(String[] args) {

  }
}
