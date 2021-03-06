/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package explain;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.apache.hadoop.hive.ql.exec.ConditionalTask;
import org.apache.hadoop.hive.ql.exec.MapRedTask;
import org.apache.hadoop.hive.ql.exec.Operator;
import org.apache.hadoop.hive.ql.exec.TableScanOperator;
import org.apache.hadoop.hive.ql.exec.Task;
import org.apache.hadoop.hive.ql.parse.ParseException;
import org.apache.hadoop.hive.ql.plan.Explain;
import org.apache.hadoop.hive.ql.plan.FileSinkDesc;
import org.apache.hadoop.hive.ql.plan.FilterDesc;
import org.apache.hadoop.hive.ql.plan.GroupByDesc;
import org.apache.hadoop.hive.ql.plan.HashTableSinkDesc;
import org.apache.hadoop.hive.ql.plan.JoinDesc;
import org.apache.hadoop.hive.ql.plan.MapJoinDesc;
import org.apache.hadoop.hive.ql.plan.MapredWork;
import org.apache.hadoop.hive.ql.plan.PartitionDesc;
import org.apache.hadoop.hive.ql.plan.ReduceSinkDesc;
import org.apache.hadoop.hive.ql.plan.SelectDesc;
import org.apache.hadoop.hive.ql.plan.TableScanDesc;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.mapred.JobConf;



public class ExplainTask  {
  private static final long serialVersionUID = 1L;
  private String stageid;
  private MapredWork mapredwork;//当前的mr
  private JobConf jobconf;
  private static Map<String,String> explainWorkName = new HashMap<String,String>();
  private static Map<Class,String> explainOpName = new HashMap<Class,String>();
  private static Set<String> hideDesc = new HashSet<String>(); 
  private static Set<String> hideWork = new HashSet<String>(); 
  private static Set<Class> hideOp = new HashSet<Class>(); 
  private static Map<String,String> path2stage = new HashMap<String,String>();
  private static Map<String,Set<String>> stage2input = new HashMap<String, Set<String>>();
  private ParseDriver parser = new ParseDriver();
  private String parseredSQL = null;
  private QueryInfo queryBlock = null;
  private MRBlockInfo mrBlock = null;
  
  
  {
	  explainWorkName.put("getAliasToWork","[Map 端] 操作 ");
	  explainWorkName.put("getReducer","[Reduce 端] 操作 ");
	  explainWorkName.put("getMapLocalWork","在单机上执行");
	  
	  
	  explainOpName.put(TableScanDesc.class,"=>输入文件:");
	  explainOpName.put(JoinDesc.class,"进行Join关联");
	  explainOpName.put(MapJoinDesc.class,"进行MapJoin");
	  explainOpName.put(ReduceSinkDesc.class,"");
	  explainOpName.put(GroupByDesc.class, "进行分组 GroupBy");
	  explainOpName.put(SelectDesc.class, "");//进行字段选择
	  explainOpName.put(FileSinkDesc.class, "");//输出到外部文件
	  explainOpName.put(HashTableSinkDesc.class, "构建Hash表，用于Mapjoin");
	  explainOpName.put(FilterDesc.class, "进行where条件过滤");
	  
	  hideWork.add("getAliasToFetchWork");

	  
	  hideDesc.add(SelectDesc.class.getName());
	  hideDesc.add(FileSinkDesc.class.getName());
	  hideDesc.add(ReduceSinkDesc.class.getName());
	  hideDesc.add(TableScanDesc.class.getName());
	  hideDesc.add(GroupByDesc.class.getName());
	  hideDesc.add(JoinDesc.class.getName());
	  hideDesc.add(HashTableSinkDesc.class.getName());
	  hideDesc.add(MapJoinDesc.class.getName());
  }
  
  public ExplainTask() {
    super();
  }

   
  public int explain(ArrayList<Task<? extends Serializable>> rootTasks, OutputStream outS) {

    PrintStream out = null;
    try {
      out = new PrintStream(outS);
      // Go over all the tasks and dump out the plans
      outputStagePlans(out, rootTasks, 0);

      return (0);
    } catch (Exception e) {
 
      return (1);
    } finally {
      IOUtils.closeStream(out);
    }
  }
  public int explain(String stageid, Task<? extends Serializable> rootTask, OutputStream outS, JobConf jobconf) {
	  
      this.stageid = stageid;
      this.jobconf = jobconf;
      this.mrBlock = new MRBlockInfo();
      
      String sql = jobconf.get("hive.query.string","").replace("\n", " ");
      
	  if (!sql.equals(parseredSQL)) { //if need to refresh
	  	try {
	  		queryBlock = parser.getQueryBlock(sql);
	  		parseredSQL = sql;
	  	} catch (ParseException e) {
	  		// TODO Auto-generated catch block
	  		e.printStackTrace();
	  	}
	  }
	  
      if (rootTask!=null && rootTask instanceof MapRedTask) {
    	   mapredwork = ((MapRedTask)rootTask).getWork();
      }
      PrintStream out = null;
      try {
        out = new PrintStream(outS);
        List rootTasks = new ArrayList();
        rootTasks.add(rootTask);
        // Go over this task and dump out the plan
        outputStagePlans(out, rootTasks, 0);
        
        //output the sql this task will execute
        outputSQL(out);
        
        return (0);
      } catch (Exception e) {
    	  e.printStackTrace();
          return (1);
      } finally {
        IOUtils.closeStream(out);
      }
  }
  
  private void outputSQL(PrintStream out) {
	  
	  List<Position> inputlist = new ArrayList<Position>();
	  for (String inputTablealias : mrBlock.inputTable) {
		  Position inp = queryBlock.joinmap.get(inputTablealias);
		  if (inp!=null) {
			  inputlist.add(inp);
		  }
	  }
	  stage2input.put(this.stageid, mrBlock.inputTable);//还得加入当前ｓｔａｇｅ
	  
	  List<Position> inputStage = new ArrayList<Position>();
	  
	  for (String inputStageid : mrBlock.inputStage) {
		  ASTPNode parent = queryBlock.findParent(stage2input.get(inputStageid));
		  if (parent == null) continue;
		  Position stagepos = new Position(parent.startindex,parent.stopindex);
		  stagepos.outputPrexfix = "已经执行的" + inputStageid + "  ";
		  stagepos.outputPostfix = stagepos.outputPrexfix;
		  inputStage.add(stagepos);
		  Position parentpos = queryBlock.joinmap.get(parent.scope);
		  if (parentpos != null) {
			  inputlist.add(parentpos);
		  }
	  }
	  
	  //Position.sort(inputlist);
	  
	  System.out.println("****meregr sql****");
	  
	  Position.mergerOutput(inputlist,inputStage, System.out, queryBlock.sql);
	  
	  System.out.println("****debug sql****");
	  
	  for(Position s : inputlist) {
		  System.out.println(queryBlock.sql.substring(s.startindex,s.stopindex + 1));
	  }
	  System.out.println("****stageid****");
	  
	  for(Position s : inputStage) {
		  System.out.println(queryBlock.sql.substring(s.startindex,s.stopindex + 1));
	  }
	  System.out.println("********");
  }
  
  
  private String indentString(int indent) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < indent; ++i) {
      sb.append(" ");
    }

    return sb.toString();
  }
  
  // 取得alias对应的path.返回头一个可能的路径
  private String aliasToPath(String alias) {
	  Set<Entry<String, ArrayList<String>>> set = mapredwork.getPathToAliases().entrySet();
	  for (Entry<String, ArrayList<String>> entry : set) {
		  if (entry.getValue().get(0).equals(alias)) {
			  return entry.getKey();
		  }
	  }
	  return "";
  }

  // 取得输入输出路径对应的产生stage。
  private String pathToStage(String path) {
	  return path2stage.get(path);
  }
  
  private void addPathToStage(FileSinkDesc fsd) {
	  path2stage.put(fsd.getDirName(), stageid);
  }
  
  private void outputMap(Map<?, ?> mp, String header, PrintStream out,
      boolean extended, int indent) throws Exception {

    boolean first_el = true;
    TreeMap<Object, Object> tree = new TreeMap<Object, Object>();
    tree.putAll(mp);
    for (Entry<?, ?> ent : tree.entrySet()) {
      if (first_el) {
        out.println(header);
      }
      first_el = false;
      
      if (ent.getValue() instanceof TableScanOperator) {//如果是TableScanDesc
    	  out.print(indentString(indent));
    	  String rawTableName = ent.getKey().toString();
    	  String input = "";
    	  
    	  if (rawTableName.contains("://")) {//如果是路径
    		  String stage = pathToStage(rawTableName);
    		  input = stage + "的输出文件";
    		  mrBlock.inputStage.add(stage);
    	  } else if (rawTableName.contains("$")) {//如果是$INTNAME 
    		  String stage = pathToStage(aliasToPath(rawTableName));
    		  input = stage + "的输出文件";
    		  mrBlock.inputStage.add(stage);
    	  } else { //普通对应
    		  input = " 表" + rawTableName;
    		  mrBlock.inputTable.add(rawTableName);
    	  }
    	 
          out.printf("%s ", explainOpName.get(TableScanDesc.class) +   input);
      } else {
          // Print the key
          out.print(indentString(indent));
          out.printf("%s ", ent.getKey().toString());
      }
      // Print the value
      if (isPrintable(ent.getValue())) {
        out.print(ent.getValue());
        out.println();
      } else if (ent.getValue() instanceof List
          || ent.getValue() instanceof Map) {
        out.print(ent.getValue().toString());
        out.println();
      } else if (ent.getValue() instanceof Serializable) {
        out.println();
        outputPlan((Serializable) ent.getValue(), out, extended, indent + 2);
      } else {
        out.println();
      }
    }
  }

  private void outputList(List<?> l, String header, PrintStream out,
      boolean extended, int indent) throws Exception {

    boolean first_el = true;
    boolean nl = false;
    for (Object o : l) {
      if (first_el) {
        out.print(header);
      }

      if (isPrintable(o)) {
        if (!first_el) {
          out.print(", ");
        } else {
          out.print(" ");
        }

        out.print(o);
        nl = true;
      } else if (o instanceof Serializable) {
        if (first_el) {
          out.println();
        }
        outputPlan((Serializable) o, out, extended, indent + 2);
      }

      first_el = false;
    }

    if (nl) {
      out.println();
    }
  }

  private boolean isPrintable(Object val) {
    if (val instanceof Boolean || val instanceof String
        || val instanceof Integer || val instanceof Byte
        || val instanceof Float || val instanceof Double) {
      return true;
    }

    if (val != null && val.getClass().isPrimitive()) {
      return true;
    }

    return false;
  }
		
  private void outputPlan(Serializable work, PrintStream out, boolean extended,
      int indent) throws Exception {
    // Check if work has an explain annotation
    Annotation note = work.getClass().getAnnotation(Explain.class);

    if (note instanceof Explain) {
      Explain xpl_note = (Explain) note;
      if (extended || xpl_note.normalExplain()) {
        out.print(indentString(indent));
        String displayName = xpl_note.displayName();
        //输出操作符,work
        if (explainOpName.get(work.getClass()) != null) {
          displayName = explainOpName.get(work.getClass());
        }
        
        if (work instanceof FileSinkDesc) { //FileSinkDesc
        	addPathToStage((FileSinkDesc)work);
        }
        if (work instanceof TableScanDesc) {
        	displayName = "";
        }
        out.println(displayName);
      }
    }

    // If this is an operator then we need to call the plan generation on the
    // conf and then
    // the children
    if (work instanceof Operator) {
      Operator<? extends Serializable> operator = (Operator<? extends Serializable>) work;
      if (operator.getConf() != null) {
    	 outputPlan(operator.getConf(), out, extended, indent);
      }
      if (operator.getChildOperators() != null) {
        for (Operator<? extends Serializable> op : operator.getChildOperators()) {
          outputPlan(op, out, extended, indent + 2);
        }
      }
      return;
    } else if (hideDesc.contains(work.getClass().getName())) {
    	return ;
    }

    // We look at all methods that generate values for explain
    Method[] methods = work.getClass().getMethods();
    Arrays.sort(methods, new MethodComparator());
   									 
    for (Method m : methods) { 
      int prop_indents = indent + 2;
      note = m.getAnnotation(Explain.class);

      if (note instanceof Explain) {
        Explain xpl_note = (Explain) note;

        if (extended || xpl_note.normalExplain()) {

          Object val = m.invoke(work);

          if (val == null) {
            continue;
          }
          String displayName = xpl_note.displayName();
          
          if (hideWork.contains(m.getName())) {
        	  continue;
          }
          
          if (explainWorkName.get(m.getName()) != null) {
        	  displayName = explainWorkName.get(m.getName());
          }
          
          String header = null;
          if (!displayName.equals("")) {
        	  
            header = indentString(prop_indents) + displayName + ":";
          } else {
            prop_indents = indent;
            header = indentString(prop_indents);
          }
          
          if (isPrintable(val)) {

            out.printf("%s ", header);
            out.println(val);
            continue;
          }
          // Try this as a map
          try {
            // Go through the map and print out the stuff
            Map<?, ?> mp = (Map<?, ?>) val;
            outputMap(mp, header, out, extended, prop_indents + 2);
            continue;
          } catch (ClassCastException ce) {
            // Ignore - all this means is that this is not a map
          }

          // Try this as a list
          try {
            List<?> l = (List<?>) val;
            outputList(l, header, out, extended, prop_indents + 2);

            continue;
          } catch (ClassCastException ce) {
            // Ignore
          }

          // Finally check if it is serializable
          try {
            Serializable s = (Serializable) val;
            out.println(header);
            outputPlan(s, out, extended, prop_indents + 2);

            continue;
          } catch (ClassCastException ce) {
            // Ignore
          }
        }
      }
    }
  }
 
  private void outputPlan(Task<? extends Serializable> task, PrintStream out,
      boolean extended, HashSet<Task<? extends Serializable>> displayedSet,
      int indent) throws Exception {

    if (displayedSet.contains(task)) {
      return;
    }
    displayedSet.add(task);
  
    // 如果指定了stageid，那么只输出该stage
    if (stageid==null || (stageid != null && task.getId().equals(stageid))) {
	    out.print(indentString(indent));
	    out.printf("Stage: %s\n", task.getId());
	    // Start by getting the work part of the task and call the output plan for
	    // the work
	    outputPlan(task.getWork(), out, extended, indent + 2);// 输出work，和 operator
	    out.println();
	    
    }
   
    if (task instanceof ConditionalTask
        && ((ConditionalTask) task).getListTasks() != null) {
      for (Task<? extends Serializable> con : ((ConditionalTask) task)
          .getListTasks()) {
        outputPlan(con, out, extended, displayedSet, indent);
      }
    }
    if (task.getChildTasks() != null) {
      for (Task<? extends Serializable> child : task.getChildTasks()) {
        outputPlan(child, out, extended, displayedSet, indent);
      }
    }
  }

  public void outputDependencies(PrintStream out,
	      List<Task<? extends Serializable>> rootTasks, int indent) throws Exception {
	    out.print(indentString(indent));
	    out.println("STAGE DEPENDENCIES:");
	    for (Task<? extends Serializable> rootTask : rootTasks) {
	      outputDependencies(rootTask, out, indent + 2, true);
	    }
  }
  
  private final Set<Task<? extends Serializable>> dependeciesTaskSet =
    new HashSet<Task<? extends Serializable>>();

  private void outputDependencies(Task<? extends Serializable> task,
      PrintStream out, int indent, boolean rootTskCandidate) throws Exception {

    if (dependeciesTaskSet.contains(task)) {//�Ƿ��ѷ��ʹ��task
      return;
    }
    dependeciesTaskSet.add(task);
    boolean first = true;
    out.print(indentString(indent));
    out.printf("%s", task.getId());
    if ((task.getParentTasks() == null || task.getParentTasks().isEmpty())) {
      if (rootTskCandidate) {
        out.print(" is a root stage");
      }
    } else {
      out.print(" depends on stages: ");
      first = true;
      for (Task<? extends Serializable> parent : task.getParentTasks()) {
        if (!first) {
          out.print(", ");
        }
        first = false;
        out.print(parent.getId());
      }
    }

    Task<? extends Serializable> cuurBackupTask = task.getBackupTask();
    if(cuurBackupTask != null) {
      out.print(" has a backup stage: ");
      if (!first) {
        out.print(", ");
      }
      first = false;
      out.print(cuurBackupTask.getId());
    }


    if (task instanceof ConditionalTask
        && ((ConditionalTask) task).getListTasks() != null) {
      out.print(" , consists of ");
      first = true;
      for (Task<? extends Serializable> con : ((ConditionalTask) task)
          .getListTasks()) {
        if (!first) {
          out.print(", ");
        }
        first = false;
        out.print(con.getId());
      }
    }


    out.println();

    if (task instanceof ConditionalTask
        && ((ConditionalTask) task).getListTasks() != null) {
      for (Task<? extends Serializable> con : ((ConditionalTask) task)
          .getListTasks()) {
        outputDependencies(con, out, indent, false);
      }
    }

    if (task.getChildTasks() != null) {
      for (Task<? extends Serializable> child : task.getChildTasks()) {
        outputDependencies(child, out, indent, true);
      }
    }

  }

  public void outputStagePlans(PrintStream out,
      List<Task<? extends Serializable>> rootTasks, int indent) throws Exception {
    out.print(indentString(indent));
    out.println("STAGE PLANS:");
    HashSet<Task<? extends Serializable>> displayedSet =
      new HashSet<Task<? extends Serializable>>();
    for (Task<? extends Serializable> rootTask : rootTasks) { 
      outputPlan(rootTask, out, false, displayedSet, indent + 2);
    }
  }

  /**
   * MethodComparator.
   *
   */
  public static class MethodComparator implements Comparator {
    public int compare(Object o1, Object o2) {
      Method m1 = (Method) o1;
      Method m2 = (Method) o2;
      return m1.getName().compareTo(m2.getName());
    }
  }

 

 

}
