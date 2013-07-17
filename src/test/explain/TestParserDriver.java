package test.explain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.hadoop.hive.ql.lib.Node;
import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.ParseException;

import explain.ASTPNode;
import explain.ParseDriver;

public class TestParserDriver {
	public static void main(String[] args) {
		ParseDriver parser = new ParseDriver();
		try {
			//String sql = "select * from (select * from (select *  from  z c) b union all select * from ax c ) a";
			String sql = "select  * from (select *  from ss join a on a.s = s.bsdf and c.s=2 left outer join c on c.s = a.ss and c.s=c.xxx+13"
					+ " right outer join c on c.s = a.x group by s.sfd , s.sdf)  a left outer join c on c.s = a.ss and c.s=c.xxx+13 right outer join c on c.s = a.x + 120 group by sfd,sdf";
			ASTNode nodes = parser.parse(sql);
			System.out.println(nodes.dump());
		/*	System.out.println(sql.substring(15,98));
			System.out.println(sql.substring(18,49));
			System.out.println(sql.substring(28,37));*/
			
			TestParserDriver s = new TestParserDriver();
		 	s.walk(nodes);
 			for (ASTPNode n: s.groupbys) {

				System.out.println(n.scope);
				
				System.out.println(sql.substring(n.startindex, n.stopindex) );
				
				System.out.println("*****");
			} 
		} catch (ParseException e) {
			e.printStackTrace();
		}

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
	public String currenScope = "";
	public	List<ASTPNode> tables = new ArrayList<ASTPNode>();
	public	List<ASTPNode> joins = new ArrayList<ASTPNode>();
	public	List<ASTPNode> groupbys = new ArrayList<ASTPNode>();

	public  Set<String> jointype = new HashSet<String>();
	{
		jointype.add("TOK_JOIN");
		jointype.add("TOK_LEFTOUTERJOIN");
		jointype.add("TOK_RIGHTOUTERJOIN");
		jointype.add("TOK_FULLOUTERJOIN");
		jointype.add("TOK_LEFTSEMIJOIN");
	}
	public void visit(ASTPNode node) {
		if (node.getToken() == null) return;
		
		if ("TOK_TABREF".equals(node.getText()) || "TOK_SUBQUERY".equals(node.getText())){
			String oldScope = currenScope;
			String tablename = "";
			if (node.getChildCount() == 1 ) {
				tablename = node.getChild(0).getChild(0).getText();
			} else if (node.getChildCount() == 2 ) {
				tablename = node.getChild(1).getText();
			}
			currenScope = currenScope + (currenScope.equals("") ? "" : ":") + tablename;
			
			node.scope = currenScope;
			tables.add(node);
			
			walk(node);
			currenScope = oldScope;
			
		} else if (jointype.contains(node.getText())) {
			node.scope = currenScope;
			joins.add(node);
			walk(node);
		} else if ("TOK_GROUPBY".equals(node.getText())) {
			node.scope = currenScope;
			groupbys.add(node);
			walk(node);
		} else {
			walk(node);
		}
	}
	
	
	public static void main0(String[] args) {
		ParseDriver parser = new ParseDriver();
		try {
			String sql = "select * from (select * from (select *  from \n z) b union all select * from (select * \n\n\n from s) c ) a\n\n";
			ASTNode parse = parser.parse(sql);
			Integer[] p = parser.aliasmap.get("a:c");
			System.err.println(getSubquery(sql,p));
			
			p = parser.aliasmap.get("a");
			System.err.println(getSubquery(sql,p));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
	static String[] splits;
	public static String getSubquery(String sql, Integer[] p) {
		if (sql == null || p == null) return null;
		StringBuffer sb = new StringBuffer();
		int i = 0;
		int line = p[0];
		int pos = p[1];
		
		if (splits == null) {
			splits = tolines(sql).toArray(new String[0]);
		}
		//splits = sql.split("\n");
		sb.append(splits[line++ - 1].substring(pos));
		
		while (line < p[2]) { 
			sb.append(splits[line++ -1]);
		}
		if (p[2] != p[0]) {
			sb.append(splits[p[2] -1].substring(0, p[3]));
		}
			
		return sb.toString();
	}
	
	public static List<String> tolines(String raw) {
		List<String> arr = new ArrayList<String>();
		StringBuffer buff = new StringBuffer();
		int i = 0;
		int len = raw.length();
		while (i < len) {
			char ch = raw.charAt(i);
			buff.append(ch);
			if (ch == '\n') {
				arr.add(buff.toString());
				buff.setLength(0);
			}
			i++;
		}
		if (buff.length() > 0) {
			arr.add(buff.toString());
		}
		return arr;
	}
	
}
