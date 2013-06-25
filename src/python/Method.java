package python;
/**
 * 方法名方式调用
 * @author yuanhang.ghj
 *
 */
public class Method extends Code {
	private String funname = "";
	@Override
	protected String genNewFunCode (String raw, String DeclaredArgs) {
		funname = raw.trim();
		return null;
	}
	@Override
    protected String genEvalFunName() {
	  return funname;
    }
}
