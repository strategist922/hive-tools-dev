package explain;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.hive.ql.QueryPlan;
import org.apache.hadoop.hive.ql.exec.MapredLocalTask;
import org.apache.hadoop.hive.ql.exec.Task;

import org.apache.hadoop.hive.ql.hooks.PreJobHook;
import org.apache.hadoop.hive.ql.session.SessionState;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.RunningJob;

import python.Base32;

public class ExplainPerJobHook implements PreJobHook  {
	ExplainTask explainTask = new ExplainTask();

	@Override
	public void run(SessionState session, QueryPlan queryPlan, JobConf job,
			Integer taskId) throws Exception {

		ArrayList<Task<? extends Serializable>> rootTasks = queryPlan.getRootTasks();
		Task<? extends Serializable>  rootTask = findTasksForStage(rootTasks, "Stage-" + taskId);
		ByteArrayOutputStream outs = new ByteArrayOutputStream();
		
		explainTask.explain("Stage-" + taskId, rootTask, outs, job);
		
		String formattedPlan = new String(outs.toByteArray());
		
		outs.close();
		System.out.println(formattedPlan);
		
		/*
		if (job.get("hive.job.post.hooks") == null || 
				!job.get("hive.job.post.hooks").contains("hook.ExplainPerJobHook")) {
			job.set("hive.job.post.hooks", "explain.ExplainPerJobHook");
		}*/
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
 
	// 运行后的hook，用于解释hashtable sink
		
	public void run(SessionState session, QueryPlan queryPlan, JobConf job,
			RunningJob runningJob, Integer taskId) {
		// TODO Auto-generated method stub
		try {
			if (!runningJob.isSuccessful()) return;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		List<Task<? extends Serializable>> rootTasks = queryPlan.getRootTasks();
		Task<? extends Serializable>  rootTask = findTasksForStage(rootTasks, "Stage-" + taskId);
		List<Task<? extends Serializable>> children = rootTask.getChildTasks();
		if (children==null) return;
		for (Task<? extends Serializable> task : children) {
			if (task instanceof MapredLocalTask) {
				ByteArrayOutputStream outs = new ByteArrayOutputStream();
				explainTask.explain(task.getId(), task, outs, job);
				String formattedPlan = new String(outs.toByteArray());
				System.out.println(formattedPlan);
			}
		}
	}
}
