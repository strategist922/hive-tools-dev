package explain;

import org.antlr.runtime.Token;
import org.apache.hadoop.hive.ql.parse.ASTNode;

public class ASTPNode extends ASTNode {
	public int startindex, stopindex;
	
	
	public String scope;
	public ASTPNode(Token payload) {
		// TODO Auto-generated constructor stub
		super(payload);
	}

}
