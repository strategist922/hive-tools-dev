package hook;

import org.apache.hadoop.hive.ql.QueryPlan;
import org.apache.hadoop.hive.ql.hooks.PreJobHook;
import org.apache.hadoop.hive.ql.session.SessionState;
import org.apache.hadoop.mapred.JobConf;

import python.Base32;
/**
 * 配置运行时的 hive-exe.jar
 * @author yuanhang.ghj
 *
 */
public class ExecJarHook implements PreJobHook  {
 
	@Override
	public void run(SessionState session, QueryPlan queryPlan, JobConf job,
			Integer taskId) throws Exception {
		System.out.println("*******current exec jar:" + job.getJar());
		job.setJar("/home/hive/hive/lib/hive-exec-1.1.4.jar ");
	}
 

}
