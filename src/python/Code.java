package python;



import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorUtils;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorUtils.ObjectInspectorCopyOption;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.WritableConstantStringObjectInspector;
import org.apache.hadoop.io.Text;
import org.python.core.Py;
import org.python.core.PyCode;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;
/**
 * 代码块方式
 * @author yuanhang.ghj
 *
 */
public class Code extends GenericUDF {

  private ObjectInspector funcOI;
  private ObjectInspector[] argsOI;//从1开始
  private Text result;
  private PyCode py_fun;
  private PythonInterpreter interp ;
  private int argcount = 0;
  private boolean printcode = true;
  
  private Importor importor = new Importor();
  private PythonConf conf = new PythonConf();

  @Override
  public ObjectInspector initialize(ObjectInspector[] arguments)
      throws UDFArgumentException {

    // Check if two arguments were passed
    if (arguments.length < 1) {
      throw new UDFArgumentException(
          "The function py" + " accepts " + 
              " 1 and more arguments. python('code', arguments...)");
    }
    
    importor.ini();
    
    conf.ini();
    
    funcOI = arguments[0];
    
    argcount = arguments.length - 1;
    
    argsOI = arguments;
   
    result = new Text();
    //编译代码块为函数
	String strcode = ((WritableConstantStringObjectInspector)arguments[0])
			.getWritableConstantValue().toString();
    if (strcode.trim().equals("")) {
        throw new UDFArgumentException(
            "The function py" + "  " + 
                "第一个参数不能为空");
    }
    
	iniPythonEnv(strcode);
    
    
    return PrimitiveObjectInspectorFactory.writableStringObjectInspector;
  }


//默认返回字符串先.
  @Override
  public Object evaluate(DeferredObject[] arguments) throws HiveException {
	  
    Object pycodeWO = arguments[0].get();
    
    if (pycodeWO == null)
        return result;


    //设置实参值
    for (int i=0; i < argcount; i++) {
        Object wobj = arguments[i+1].get();
        Object arg = null; 
        if (wobj != null)
            arg = ObjectInspectorUtils.copyToStandardObject(wobj, 
                    argsOI[i+1], ObjectInspectorCopyOption.JAVA);
        else {
            if (conf.isSkipNone) return result;
            arg = Py.None; 
        }
          interp.set(genArg(i), arg);
    }
    // 执行该代码
    if (conf.isTryCatch) {
        try {
            eval();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    } else {
        eval();
    }
    // 返回结果
    return result;
  }
  
  private void eval() {
    interp.exec(py_fun);
    PyObject res = interp.get("__hive_result__");
    result.set(res.toString());
  }

  private void iniPythonEnv(String rawcode) {
    interp = new PythonInterpreter();
    
    interp.exec("import sys;reload(sys);sys.setdefaultencoding('utf-8')");//设置编码，处理中文
    
    importor.includeTo(interp);
    
    String argsDec = genArgs(argcount);
    
    String funDeclare = genNewFunCode(rawcode, argsDec);
    
    try {
	    if (funDeclare != null)
	    	interp.exec(funDeclare); //预先定义函数
    } catch (org.python.core.PySyntaxError e) {
    	throw new RuntimeException("Pyhton代码块异常，请检查python生成的函数，或者在python命令行中测试运行。\n" 
    			+ "检查以下函数 : \n\n" + funDeclare);
    }
    
    String evalfun = genEvalFunName();
    
    if (evalfun == null)
    	throw new RuntimeException("genEvalFunName() 求值时候的入口函数名不能为空");
    
    //求值时候的入口函数
    py_fun = interp.compile("__hive_result__ = " + evalfun + "(" + argsDec + ")");
  }
  
  /**
   * 求值时候的入口函数名
   * @return
   */
  protected String genEvalFunName() {
	  return "adhocfun";
  }
  
  /**
   * 形式参数名字
   * @param index
   * @return
   */
  protected  String genArg(int index) {
      return "col"+(index+1);
  }
  
  private String genArgs(int argcount) {
    StringBuilder bu = new StringBuilder();
    
    for (int i=0; i < argcount; i++) {
        bu.append(genArg(i)).append(',');
    }
    if (argcount > 0) {
        bu.deleteCharAt(bu.length()-1);
    } else {
        bu.append(" ");//avoid null to print
    }
    return bu.toString(); 
  }
  
  protected String genNewFunCode (String rawcode, String DeclaredArgs) {
    String[] codelines = rawcode.split("\n");
    
    if (codelines == null) return null;
    
    StringBuilder bu = new StringBuilder();
    
    bu.append("def adhocfun(").append(DeclaredArgs).append("):\n");
   
    for (String line : codelines) {
        // don't change indent and add the one space char
        if (! "".equals(line.trim())) {
            bu.append(" ").append(line).append("\n");
        }
    }
    return  bu.toString();
  }


  @Override
  public String getDisplayString(String[] children) {
    return "py(function,arg1,arg2...)";
  }
 
}
