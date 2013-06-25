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


public class PythonFile extends GenericUDF {
 
  private ObjectInspector funcOI;
  private ObjectInspector[] argsOI;//从1开始
  
  private Text result;
  private String[] python_files;
  private PyCode py_fun;
  private PythonInterpreter interp ;
  private int argcount = 0;
  private boolean isSkipNone = false;
  private boolean isTryCatch = false;
  @Override
  public ObjectInspector initialize(ObjectInspector[] arguments)
      throws UDFArgumentException {

    // Check if two arguments were passed
    if (arguments.length <= 1) {
      throw new UDFArgumentException(
          "The function py" + " accepts " + 
              " 2 and more arguments.");
    }
    String paths = System.getProperty("python_path");
  
    if (paths != null)
    	python_files = paths.split(",");
    
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
	  
/*	if (arguments == null || arguments[0] == null || arguments[1] == null || python_file == null)
			return result;*/
	if (python_files == null)
	   throw new UDFArgumentException("please add the python file first like : add file abc.py");
	
	
    Object funcName = arguments[0].get();
    
    
	if (funcName == null )
		return result;
    
    
    
    if (interp == null) { //这里不能放ini, 在hive语法分析时候被调用
    	interp = new PythonInterpreter();
    	for (String pyfile : python_files){
    		if (pyfile != null)
    			interp.execfile(pyfile);
    	}
    }
    
	if (py_fun == null){
	    String s1 = ObjectInspectorUtils.copyToStandardObject(funcName, funcOI, ObjectInspectorCopyOption.JAVA).toString();
	    StringBuilder bu = new StringBuilder();
	    for (int i=0; i < argcount; i++) {
	    	bu.append("arg").append(i).append(',');
	    }
	    if (argcount > 0) {
	    	bu.deleteCharAt(bu.length()-1);
	    } else {
	    	bu.append(" ");
	    }
	    	
		py_fun = interp.compile(String.format("result = %s(%s)", s1, bu.toString()));
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
  	  	 interp.set("arg"+i, arg);
  	}

  	if (isTryCatch) {
  		try {
  			interp.exec(py_fun);
  		  	res = interp.get("result");
  		    result.set(res.toString());
  		    return result;
  		} catch (RuntimeException e) {
  			e.printStackTrace();
  			return result;
  		}
  	} else {
			interp.exec(py_fun);
  		  	res = interp.get("result");
  		    result.set(res.toString());
  		    return result;
  	}
  	
  	

  }

  @Override
  public String getDisplayString(String[] children) {

    return "py(function,arg1,arg2...)";
  }
}
