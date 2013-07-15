package test.explain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.hadoop.hive.ql.parse.ParseException;

import explain.ParseDriver;

public class TestParserDriver {
	public static void main(String[] args) {
		ParseDriver parser = new ParseDriver();
		try {
			String sql = "select * from (select * from (select *  from \n z) b union all select * from (select * \n\n\n from s) c ) a\n\n";
			parser.parse(sql);
			Integer[] p = parser.aliasmap.get("a:c");
			System.err.println(getSubquery(sql,p));
			
			 p = parser.aliasmap.get("a");
			System.err.println(getSubquery(sql,p));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
	public static String getSubquery(String sql, Integer[] p) {
		if (sql == null || p == null) return null;
		StringBuffer sb = new StringBuffer();
		int i = 0;
		int line = p[0];
		int pos = p[1];
		
		String[] splits = tolines(sql).toArray(new String[0]);
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
