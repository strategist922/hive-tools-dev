package test.explain;

import junit.framework.TestCase;

import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.ParseException;

import explain.ASTPNode;
import explain.ParseDriver;
import explain.QBAliasWalker;


public class TestQBAliasWalker extends TestCase {
	
	public void testgroupby() throws Exception {
		// TODO Auto-generated method stub
		ParseDriver parser = new ParseDriver();
		try {
			//String sql = "select * from (select * from (select *  from  z c) b union all select * from ax c ) a";
			String sql = "select  * from (select *  from ss join a on a.s = s.bsdf and c.s=2 left outer join c on c.s = a.ss and c.s=c.xxx+13"
					+ " right outer join c on c.s = a.x group by s.sfd , s.sdf)  a left outer join c on c.s = a.ss and c.s=c.xxx+13 right outer join c on c.s = a.x + 120 group by sfd,sdf";
			ASTNode nodes = parser.parse(sql);
			System.out.println(nodes.dump());
			
			QBAliasWalker s = new QBAliasWalker();
		 	s.walk(nodes);
 			for (ASTPNode n: s.groupbys) {

				System.out.println(n.scope);
				
				System.out.println(sql.substring(n.startindex, Math.min(sql.length(), n.stopindex)));
				
				System.out.println("*****");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
	public void testJoin() throws Exception {
		// TODO Auto-generated method stub
		ParseDriver parser = new ParseDriver();
		try {
			//String sql = "select * from (select * from (select *  from  z c) b union all select * from ax c ) a";
			String sql = "select  * from (select *  from ss join a on a.s = s.bsdf and c.s=2 left outer join c on c.s = a.ss and c.s=c.xxx+13"
					+ " right outer join c on c.s = a.x group by s.sfd , s.sdf)  a left outer join c on c.s = a.ss and c.s=c.xxx+13 right outer join c on c.s = a.x + 120 group by sfd,sdf";
					//	String sql = "select * from dual a left outer join dual b on a.s = b.s left outer join dual c  on c.s=a.s left outer join dual f  on 1=f.s left outer join dual e on e.s = a.s";
			ASTNode nodes = parser.parse(sql);
			System.out.println(nodes.dump());
			
			QBAliasWalker s = new QBAliasWalker();
		 	s.walk(nodes);
 			for (ASTPNode n: s.joins) {

				System.out.println(n.scope);
				
				System.out.println(sql.substring(n.startindex, Math.min(sql.length(), n.stopindex)));
				
				System.out.println("*****");
			} 
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
	public void testTables() throws Exception {
		// TODO Auto-generated method stub
		ParseDriver parser = new ParseDriver();
		try {
			 String sql = "   select * from (select dual.s from dual d left outer join dual on dual.s = d.s ) a left outer join (select dual.s from dual d left outer join dual on dual.s = d.s )b on a.s = b.s ";
			//String sql = "select  * from (select *  from ss dual join a on a.s = s.bsdf and c.s=2 left outer join c on c.s = a.ss and c.s=c.xxx+13"
			//		+ " right outer join c on c.s = a.x group by s.sfd , s.sdf)  a left outer join c on c.s = a.ss and c.s=c.xxx+13 right outer join c on c.s = a.x + 120 group by sfd,sdf";
			ASTNode nodes = parser.parse(sql);
			System.out.println(nodes.dump());
			
			QBAliasWalker s = new QBAliasWalker();
		 	s.walk(nodes);
 			for (ASTPNode n: s.tables) {

				System.out.println(n.scope);
				
				System.out.println(sql.substring(n.startindex, Math.min(sql.length(), n.stopindex)));
				
				System.out.println("*****");
			} 
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
	
	
	public void testUnion() {
		ParseDriver parser = new ParseDriver();
		try {
			 String sql = "select * from (select * from (select 1  from  (select 1 from dual group by 23) c1) b union all select 1 from dual c2 ) a";
			//String sql = "select * from (select * from (select * from (select *  from  dual ) b union all select * from dual c ) a ) e";
			ASTNode nodes = parser.parse(sql);
			System.out.println(nodes.dump());
		
			QBAliasWalker s = new QBAliasWalker();
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
