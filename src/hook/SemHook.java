package hook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.BaseTree;
import org.apache.hadoop.hive.ql.CommandNeedRetryException;
import org.apache.hadoop.hive.ql.Driver;
import org.apache.hadoop.hive.ql.exec.FetchTask;
import org.apache.hadoop.hive.ql.exec.FunctionRegistry;
import org.apache.hadoop.hive.ql.exec.Task;
import org.apache.hadoop.hive.ql.lib.Node;
import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.AbstractSemanticAnalyzerHook;
import org.apache.hadoop.hive.ql.parse.HiveParser;
import org.apache.hadoop.hive.ql.parse.HiveSemanticAnalyzerHookContext;
import org.apache.hadoop.hive.ql.parse.SemanticException;

public class SemHook extends AbstractSemanticAnalyzerHook {

 

	@Override
	public ASTNode preAnalyze(HiveSemanticAnalyzerHookContext context,
			ASTNode ast) throws SemanticException {
		// TODO Auto-generated method stub
		
	 // 防止下面的driver.run递归进入这个hook,先关闭这个hook
		String hook = context.getConf().get("hive.semantic.analyzer.hook");
		context.getConf().set("hive.semantic.analyzer.hook", "");
		// 加上precode代码，和配置的hook
		String prehook = context.getConf().get("hive.job.pre.hooks", "");
		if (!prehook.contains("python.PythonConf")) {
			context.getConf().set("hive.job.pre.hooks", prehook + (prehook.equals("")? "":",") + "python.PythonConf");
		}
		try {
			String cmd = " create temporary function __py__  as 'python.Method'";
			Driver driver = new Driver();
			int responseCode = driver.run(cmd).getResponseCode();
			if (responseCode != 0) {
				driver.close();
			}
		} catch (CommandNeedRetryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//深度遍历，修改ast的TOK_FUNCTION
		try {
			changeFunctionDSF(ast);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 //然后打开这个hook
		context.getConf().set("hive.semantic.analyzer.hook", hook);
		
		return super.preAnalyze(context, ast);
	}
	
	private void changeFunctionDSF(ASTNode ast) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		if (ast.getChildren() == null)
			return;
		
		if (ast.getToken().getType() == HiveParser.class.getField("TOK_FUNCTION").getInt(null)) {
			ASTNode funnode = (ASTNode) ast.getChild(0);
			String funname = funnode.token.getText();
			if (FunctionRegistry.getFunctionInfo(funname) == null && !funname.startsWith("TOK_")) {
				
				funnode.token.setText("__py__"); 
				
				ASTNode newfunnode = new ASTNode(new CommonToken(HiveParser.class.getField("StringLiteral").getInt(null),
						"\""+funname+"\""));
				ast.addChild(newfunnode);
				
				for (int i=ast.getChildCount()-2; i>0; i--) {
					ast.addChild((BaseTree) (ast.getChild(i)));
					ast.deleteChild(i);
				}
			}
			
		} else if (ast.getToken().getType() == HiveParser.TOK_FUNCTIONSTAR){
			ASTNode funnode = (ASTNode) ast.getChild(0);
			String funname = funnode.token.getText();
			if (FunctionRegistry.getFunctionInfo(funname) == null) {
				System.out.println("don't support * in python function udf yet");
			}
		}
		
		for (int i=0; i < ast.getChildCount(); i++) {
			changeFunctionDSF((ASTNode)ast.getChild(i));
		}
	}

	 
	public void postAnalyze(HiveSemanticAnalyzerHookContext context,
			List<Task<? extends Serializable>> rootTasks, FetchTask fetchTask)
			throws SemanticException {
		// TODO Auto-generated method stub
		super.postAnalyze(context, rootTasks, fetchTask);
	}



}
