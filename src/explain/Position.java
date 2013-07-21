package explain;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Position {
	public int startindex, stopindex;
	public String outputPrexfix, outputPostfix;
	public Position(int startindex, int stopindex) {
		this.startindex = startindex;
		this.stopindex = stopindex;
	}
	
	public Position(ASTPNode node) {
		this(node.startindex,node.stopindex);
	}
	
	public static Position[]   sort(List<Position> unsort) {
		Position[] arr = unsort.toArray(new Position[0]);
		Arrays.sort(arr,new Comparator<Position>() {
			@Override
			public int compare(Position o1, Position o2) {
				// TODO Auto-generated method stub
				if (o1 == null) return o2 == null ? 0:-1; 
				if (o2 == null) return o1 == null ? 0:1; 
				return o1.startindex - o2.startindex > 0 ? 1:-1;
			}
		} );
		return arr;
	}
	
	public static void mergerOutput(List<Position> inputlist,List<Position> exectedlist, PrintStream out ,String sql) {
		Position[] inputArr =  sort(inputlist);
		StringBuffer sb = new StringBuffer();
		
		for (Position input : inputArr) {
			sb.append(sql.substring(input.startindex, input.stopindex + 1));
		}
		for (Position input : exectedlist) {
			String outed = sql.substring(input.startindex, input.stopindex + 1);
			int index =  sb.indexOf(outed);
			if (index < 0) continue;
			sb.replace(index, index + outed.length(), 
					"[[ " + input.outputPrexfix + " " + outed + " " + input.outputPostfix + " ]]");
		}
		out.print(sb.toString());
		
		out.print("\n");
	}

}
