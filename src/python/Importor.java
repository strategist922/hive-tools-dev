package python;

import org.python.util.PythonInterpreter;
/**
 * 处理运行时的文件导入,和set代码段导入
 * @author yuanhang.ghj
 *
 */
public class Importor {

	private String[] python_files;
	private String   predef_code;//set python的代码
	public void ini () {
	    String paths = System.getProperty("python_path");
	    if (paths != null)
	    	python_files = paths.split(",");
	    
	    String base32code = System.getProperty(PythonConf.PYTHON_CODE);
	    predef_code = Base32.decodeString(base32code);
	}
	
	public void includeTo(PythonInterpreter interp) {
    	if (python_files != null) {
	    	for (String pyfile : python_files) {
	    		if (pyfile != null)
	    			interp.execfile(pyfile);
	    	}
    	}
    	
    	if (predef_code != null && !"".equals(predef_code)) {
    		try {
    			interp.exec(predef_code);
    		} catch (RuntimeException e) {
    			System.out.println("set python 位置错误，函数如下：\n" + predef_code);
    			throw e;
    		}
    	}
	}

}
