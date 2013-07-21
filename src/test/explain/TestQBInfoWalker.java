package test.explain;

import java.util.Set;
import java.util.Map.Entry;

import junit.framework.TestCase;

import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.ParseException;

import explain.ParseDriver;
import explain.Position;
import explain.QBAliasWalker;
import explain.QBInfoWalker;

public class TestQBInfoWalker  extends TestCase {
	
	public void testJoinInfo() {
		ParseDriver parser = new ParseDriver();
		try {
			//String sql = "select * from (select * from (select *  from  z c) b union all select * from ax c ) a";
			//String sql = "select  * from (select *  from ss join a on a.s = s.bsdf and c.s=2 left outer join c on c.s = a.ss and c.s=c.xxx+13"
			//		+ " right outer join c on c.s = a.x group by s.sfd , s.sdf)  a left outer join c on c.s = a.ss and c.s=c.xxx+13 right outer join d on c.s = a.x + 120 group by sfd,sdf";
					//String sql = "select * from dual a left outer join dual b on a.s = b.s left outer join dual c  on c.s=a.s left outer join dual f  on 1=f.s left outer join dual e on e.s = a.s";
		//	String sql = "select * from dual a left outer join (select dual.s from dual d\n" + "  left outer join dual on dual.s = d.s )b on a.s = b.sdf ";
			String sql = "select * from (select dual.s from dual d left outer join dual on dual.s = d.s ) a left outer join (select dual.s from dual d left outer join dual on dual.s = d.s )b on a.s = b.s";
			ASTNode nodes = parser.parse(sql);
			System.out.println(nodes.dump());
			
			QBAliasWalker sa = new QBAliasWalker();
		 	sa.walk(nodes);
		 	
			QBInfoWalker s = new QBInfoWalker();
		 	s.walk(nodes);
		 	
		 	Set<Entry<String, Position>> entrySet = s.joinmap.entrySet();
		 	for (Entry<String, Position> entry : entrySet) {
		 		System.out.println(entry.getKey());
		 		System.out.println(sql.substring(entry.getValue().startindex,entry.getValue().stopindex ));
		 		System.out.println("*********");
		 	}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
