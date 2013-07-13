package hook;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

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
		ByteArrayOutputStream outs = new ByteArrayOutputStream();
		job.get(name)
	//	explainTask.outputDependencies(rootTasks, outs, 0, false);
		
		explainTask.explain("Stage-" + taskId, rootTasks, outs);
		
		String formattedPlan = new String(outs.toByteArray());
		 
		outs.reset();
		System.out.println(formattedPlan);
	//	job.set("mapred.job.name", "<pre>" + formattedPlan +"</pre>");
		
		outs.close();
	}
 

}
