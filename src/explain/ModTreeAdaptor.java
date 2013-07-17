package explain;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;

public class ModTreeAdaptor extends CommonTreeAdaptor {
     List<Integer> strlenArr = new ArrayList<Integer>();
     
     @Override
     public Object create(Token payload) {
       return new ASTPNode(payload);
     }
	 @Override
	 public void setTokenBoundaries(Object t, Token startToken, Token stopToken) {
	 	if (t instanceof ASTPNode) {
	 	 ASTPNode node = (ASTPNode) t;
	 	 if (startToken != null) {
	 		 node.startindex = getOffset(startToken.getLine(), startToken.getCharPositionInLine());
	 	 }
	 	 if (stopToken != null) {
	 		 node.stopindex = getOffset(stopToken.getLine(),
	 				 stopToken.getCharPositionInLine() + stopToken.getText().length()); 
	 		 		//结尾token指的是它的index，这里加上token的length，方便取出query block
	 	 }
	 	}
	 	super.setTokenBoundaries(t, startToken, stopToken);
	 }
	 
	 public void iniwith(String command) { 
	 	int i = 0;
	 	String[] strarr = command.split("\n");
	 	while (strarr != null && i < strarr.length) {
	 		strlenArr.add(strarr[i].length());
	 		i++;
	 	} 
	 }
	 
	 private int getOffset(int line, int offset) { //antlr是从1开始
	 	assert(strlenArr != null);
	 	int roffset = 0;
	 	for (int i=0; i < line-1; i++) {
	 		roffset += strlenArr.get(i);
	 	}
	 	roffset += offset;
	 	return roffset;
	 }
}
