package hook;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.hive.ql.QueryPlan;
import org.apache.hadoop.hive.ql.exec.Task;
import org.apache.hadoop.hive.ql.hooks.PreJobHook;
import org.apache.hadoop.hive.ql.session.SessionState;
import org.apache.hadoop.mapred.JobConf;

import python.Base32;

public class ExplainPerJobHook implements PreJobHook  {
	ExplainTask explainTask = new ExplainTask();
	
	@Override
	public void run(SessionState session, QueryPlan queryPlan, JobConf job,
			Integer taskId) throws Exception {
		ArrayList<Task<? extends Serializable>> rootTasks = queryPlan.getRootTasks();
		Task<? extends Serializable>  rootTask = findTasksForStage(rootTasks, "Stage-" + taskId);
		ByteArrayOutputStream outs = new ByteArrayOutputStream();
		String currInputdirs = job.get("map.input.dir");
	//	explainTask.outputDependencies(rootTasks, outs, 0, false);
		
		explainTask.explain("Stage-" + taskId, rootTask, outs, job);
		
		String formattedPlan = new String(outs.toByteArray());
		 
		outs.reset();
		System.out.println(formattedPlan);
	//	job.set("mapred.job.name", "<pre>" + formattedPlan +"</pre>");
		
		outs.close();
	}

	private Task<? extends Serializable> findTasksForStage(
			List<Task<? extends Serializable>> rootTasks, String stageid) {
		if (rootTasks == null) return null;
		
		for (Task<? extends Serializable> t : rootTasks) {
			if (t.getId().equals(stageid)) return t;
			
			Task<? extends Serializable> r = findTasksForStage(t.getChildTasks(), stageid);
			
			if (r != null) return r;
		}
		
		return null;
	}
 

}
