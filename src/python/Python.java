package python;

import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.WritableConstantStringObjectInspector;
/**
 * 入口。目前选择运行代码块，还是函数名调用的方式
 * @author yuanhang.ghj
 *
 */
public class Python extends GenericUDF {
	GenericUDF instance = null;
	@Override
	public ObjectInspector initialize(ObjectInspector[] arguments)
			throws UDFArgumentException {
		if (arguments.length < 1 || ! (arguments[0] instanceof WritableConstantStringObjectInspector))
		      throw new UDFArgumentException("The function py" + " accepts " + 
		                  " 1st argment must be constant string");
		
		String strcode = ((WritableConstantStringObjectInspector)arguments[0])
							.getWritableConstantValue().toString();
		
		if (strcode.trim().contains("return ") && instance == null) {
			instance = new Code();//运行代码块
		} else {
			instance = new Method();//运行函数
		}
		return instance.initialize(arguments);
	}

	@Override
	public Object evaluate(DeferredObject[] arguments) throws HiveException {
		return instance.evaluate(arguments);
	}

	@Override
	public String getDisplayString(String[] children) {
		return instance.getDisplayString(children);
	}

}
