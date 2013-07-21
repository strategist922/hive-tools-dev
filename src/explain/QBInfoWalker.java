package explain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.hadoop.hive.ql.lib.Node;
import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.ParseException;

public class QBInfoWalker {
	public  Map<String,Position> joinmap = new HashMap<String,Position>();
	
	private Position lastjoinNode = null;
	private final static Set<String> jointype = new HashSet<String>();
	private int currentJoinIndex = 0;
	static
	{
		jointype.add("TOK_JOIN");
		jointype.add("TOK_LEFTOUTERJOIN");
		jointype.add("TOK_RIGHTOUTERJOIN");
		jointype.add("TOK_FULLOUTERJOIN");
		jointype.add("TOK_LEFTSEMIJOIN");
	}
	public void walk(Node node) { 
		
		walkin(node);
	}
	
	/**
	 * fill the sub table ref
	 * @param node
	 */
	private void walkin(Node node) {
		if (node == null) return;
		if (node.getChildren() != null) {
			for(Node cn : node.getChildren()) { 
				walkin(cn); 
			}
		}
		if (node instanceof ASTPNode) {
			visit((ASTPNode)node);
		}
	}
	private void visit(ASTPNode node) {
		if (node.getToken() == null) return;
		
        if (jointype.contains(node.getText())) {
        	
        	if(currentJoinIndex == 0) {//如果是最低的join node.即第一个
        		
        		ASTPNode tabref = (ASTPNode) node.getChild(0);
        		String lefttablename =tabref.scope;
        		Position leftpos = new Position((ASTPNode)node.getChild(0));
        		this.joinmap.put(lefttablename, leftpos);
        		
        		tabref = (ASTPNode) node.getChild(1);
        		String righttablename = tabref.scope;
        		Position rightpos = new Position(leftpos.stopindex, node.stopindex);
        		this.joinmap.put(righttablename, rightpos);
        		
        		lastjoinNode = rightpos;
        		
        	} else { //中间的join node
        		ASTPNode tabref = (ASTPNode) node.getChild(1);
        		String righttablename = tabref.scope;
        		Position rightpos = new Position((ASTPNode)node);
        	    if (node.isTopJoin && currentJoinIndex > 0) { //最高的join node,非subquery
        			rightpos.startindex = lastjoinNode.stopindex;
        		}
        		this.joinmap.put(righttablename, rightpos);
        		lastjoinNode = rightpos;
        	}
        	
        	node.joinIndex = (++currentJoinIndex);
        	
		} else if ("TOK_GROUPBY".equals(node.getText())) {
			
			
			 
		} else if ("TOK_UNION".equals(node.getText())) {
		 
			 
		} else if ("TOK_SUBQUERY".equals(node.getText())) {
			currentJoinIndex = 0;
		}
	}
	public static void main(String[] args) {
		ParseDriver parser = new ParseDriver();
		try {
			
			String sql = "select *  from ss join a on a.s = s.bsdf and c.s=2 left outer join c on c.s = a.ss and c.s=c.xxx+13";
				//	+ " right outer join c on c.s = a.x group by s.sfd , s.sdf)  a left outer join c on c.s = a.ss and c.s=c.xxx+13 right outer join d on c.s = a.x + 120 group by sfd,sdf";
		  // String sql = " select * from dual a left outer join (select dual.s from dual d left outer join dual on dual.s = d.s )b on a.s = b.s  ";
			//String sql = " select * from dual a left outer join (select dual.s from dual d " + " left outer join dual on dual.s = d.s )b on a.s = b.s";
			//	String sql = "   select * from (select dual.s from dual d left outer join dual on dual.s = d.s ) a left outer join (select dual.s from dual d left outer join dual on dual.s = d.s )b on a.s = b.s  ";
			ASTNode nodes = parser.parse(sql);
			System.out.println(nodes.dump());
			
			QBAliasWalker sa = new QBAliasWalker();
		 	sa.walk(nodes);
		 	
			QBInfoWalker s = new QBInfoWalker();
		 	s.walk(nodes);
		 	
		 	Set<Entry<String, Position>> entrySet = s.joinmap.entrySet();
		 	for (Entry<String, Position> entry : entrySet) {
		 		System.out.println(entry.getKey());
		 		System.out.println(entry.getValue().startindex + " " + entry.getValue().stopindex);
		 		System.out.println(sql.substring(entry.getValue().startindex,entry.getValue().stopindex));
		 		System.out.println("*********");
		 	}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
