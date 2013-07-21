package explain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class QueryInfo {
	public  Map<String,Position> joinmap = null;
	public  String sql;
	public	List<ASTPNode> tables = null;

	public List<ASTPNode> findSubTable(String prefix) {
		List<ASTPNode> matchtables = new ArrayList<ASTPNode>();
		if (tables == null) return matchtables; 
		for (ASTPNode node : tables) {
			if (node.scope.startsWith(prefix) 
					&& node.scope.length() > prefix.length() 
					&& node.scope.substring(prefix.length()).split(":").length == 2) {
				matchtables.add(node);
			}
		}
		return matchtables;
	}
	public ASTPNode findTable(String alias) {
		
		if (alias == null || tables == null) return null; 
		for (ASTPNode node : tables) {
			if (node.scope.equals(alias)) {
				return node;
			}
		}
		return null;
	}
	public ASTPNode findParent(Set<String> inputs) {
		boolean isfirst = true;
		int size = 0;
		String parentAlias = "";
		if (inputs == null) return null;
		for (String input : inputs) {
			if (isfirst) {
				size = input.split(":").length;
				isfirst = false;
				parentAlias = input.substring(0,input.lastIndexOf(":"));
			} else if (size != input.split(":").length) { //假设输入的都在同一个ｓｃｏｐｅ
				throw new RuntimeException();
			} 
		}
		return findTable(parentAlias);
	}
	
	public static void main(String[] arg) {
		String prefix = "s";
		System.out.println("s:a:d".substring(prefix.length()).split(":").length);
		System.out.println("s:a".substring(prefix.length()).split(":").length);
		System.out.println("s:".substring(prefix.length()).split(":").length);
		System.out.println("s:a".substring(0,"s:a".lastIndexOf(":")));
		
	}
	
	
}

class Table {
	String tablename;
	Map<String,Table> subtable = new HashMap<String,Table>();
}