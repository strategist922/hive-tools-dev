package test;
/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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

 
public class PythonTest extends GenericUDF {
  private ObjectInspector funcOI;
  private ObjectInspector[] argsOI;//从1开始
  
  private Text result;
  private String python_file;
  private PyCode py_fun;
  private PythonInterpreter interp ;
  private int argcount = 0;

  
  @Override
  public ObjectInspector initialize(ObjectInspector[] arguments)
      throws UDFArgumentException {

    // Check if two arguments were passed
    if (arguments.length <= 1) {
      throw new UDFArgumentException(
          "The function py" + " accepts " + 
              " 2 and more arguments.");
    }
    
    python_file = System.getProperty("python_path");
    

	//System.out.println(python_file);
    
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
    if (interp == null){ 
    	interp = new PythonInterpreter();
    }
    
	if (py_fun == null){
	    String code = ObjectInspectorUtils.copyToStandardObject(pycode, funcOI, ObjectInspectorCopyOption.JAVA).toString();
	    StringBuilder bu = new StringBuilder();
	    int index = code.lastIndexOf(";");
	    bu.append(code).insert(index+1, " __hive_result__ = ");
	    code = bu.toString().trim();
	    System.err.print("python code use : \n\n" + code + "\n\n");
		py_fun = interp.compile(code);
	}
  	
  	PyObject res = null;
  	
  	for (int i=0; i < argcount; i++) {
  		Object wobj = arguments[i+1].get();
  		Object arg = null; 
  		if (wobj != null)
  			arg = ObjectInspectorUtils.copyToStandardObject(wobj, 
  					argsOI[i+1], ObjectInspectorCopyOption.JAVA);
  		else 
  			arg = Py.None;
  		
  	  	 interp.set((char)('a'+i)+"", arg);//设置参数
  	}

  	
  	interp.exec(py_fun);
  	
  	res = interp.get("__hive_result__");
  	
    result.set(res.toString());
    
    return result;
  }

  @Override
  public String getDisplayString(String[] children) {

    return "py(function,arg1,arg2...)";
  }
  public static void main(String[] args) {

  }
}
