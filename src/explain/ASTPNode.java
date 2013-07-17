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
	

	
	
	public static class Pos {
		public int line;
		public int offset;
		public Pos(int line , int offset){
			this.line = line;
			this.offset = offset;
		}
		public String toString() {
			return line + ":" + offset;
		}
	}
}
