package explain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.hadoop.hive.ql.lib.Node;
import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.ParseException;


public class TreeWalker {
	public String currenScope = "";
	public	List<ASTPNode> tables = new ArrayList<ASTPNode>();
	public	List<ASTPNode> joins = new ArrayList<ASTPNode>();
	public	List<ASTPNode> groupbys = new ArrayList<ASTPNode>();
	
	public  Set<String> jointype = new HashSet<String>();
	private boolean isInUnion = false;
	
	{
		jointype.add("TOK_JOIN");
		jointype.add("TOK_LEFTOUTERJOIN");
		jointype.add("TOK_RIGHTOUTERJOIN");
		jointype.add("TOK_FULLOUTERJOIN");
		jointype.add("TOK_LEFTSEMIJOIN");
	}
	
	public void walk(Node node) {
		if (node == null || node.getChildren() == null) return;
		for(Node cn : node.getChildren()) {
			if (cn instanceof ASTPNode && cn != null) {
				visit((ASTPNode)cn);
			} else {
				walk(cn);
			}
		}
	}
	
	public void visit(ASTPNode node) {
		if (node.getToken() == null) return;
		
		if ("TOK_TABREF".equals(node.getText()) || "TOK_SUBQUERY".equals(node.getText())){
			String oldScope = currenScope;
			String tablename = "";
			if (node.getChildCount() == 1 ) {
				tablename = node.getChild(0).getChild(0).getText();
				currenScope = currenScope + (currenScope.equals("") ? "" : ":") + tablename;
				node.scope = currenScope;
				tables.add(node);
				
				walk(node);
				currenScope = oldScope;
				
			} else if (node.getChildCount() == 2 && !node.getChild(0).getText().equals("TOK_UNION")) {
				tablename = node.getChild(1).getText();
				currenScope = currenScope + (currenScope.equals("") ? "" : ":") + tablename;
				node.scope = currenScope;
				tables.add(node);
				
				walk(node);
				currenScope = oldScope;
				
			} else if (node.getChildCount() == 2 && node.getChild(0).getText().equals("TOK_UNION")) {
				tablename = node.getChild(1).getText();
				currenScope = (currenScope.equals("") ? "null" : currenScope) +  "-subquery*:" + tablename;
				walk(node);
			} else {
				walk(node);
			}
			
		} else if (jointype.contains(node.getText())) {
			node.scope = currenScope;
			joins.add(node);
			walk(node);
		} else if ("TOK_GROUPBY".equals(node.getText())) {
			node.scope = currenScope;
			groupbys.add(node);
			walk(node);
		} else if ("TOK_UNION".equals(node.getText())) {
			if (node.getChildren() != null) {
				
				for (int i=0; i < node.getChildCount(); i++) {
					ASTPNode n = (ASTPNode)node.getChild(i);
					if (! "TOK_QUERY".equals(n.getText())) continue;
					n.scope = currenScope.replace("*", i+1+"") + "-subquery" + (i+1);
				}
			}
			isInUnion = true;
			walk(node);
			isInUnion = false;
		} else if (isInUnion && "TOK_QUERY".equals(node.getText())) {
			String oldScope = currenScope;
			if (node.scope != null) { 
				currenScope = node.scope;
			}
			walk(node);
			currenScope = oldScope;
		} else {
		    walk(node);
		}
	}
	
	public static void main(String[] args) {
		ParseDriver parser = new ParseDriver();
		try {
			String sql = "select * from (select * from (select * from (select *  from  dual ) b union all select * from dual c ) a ) e";
	
			ASTNode nodes = parser.parse(sql);
			System.out.println(nodes.dump());
		
			
			TreeWalker s = new TreeWalker();
		 	s.walk(nodes);
 			for (ASTPNode n: s.tables) {

				System.out.println(n.scope);
				
				System.out.println(sql.substring(n.startindex, n.stopindex) );
				
				System.out.println("*****");
			} 
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
