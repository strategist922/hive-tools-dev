package hook;

import org.apache.hadoop.hive.ql.QueryPlan;
import org.apache.hadoop.hive.ql.hooks.PreJobHook;
import org.apache.hadoop.hive.ql.session.SessionState;
import org.apache.hadoop.mapred.JobConf;

import python.Base32;

public class PythonHook implements PreJobHook  {
	public final static String PYTHON_TRY_CATCH = "python.try.catch"; 
	public final static String PYTHON_SKIP_NONE = "python.skip.none"; 
	public final static String PYTHON_CODE = "python";
	@Override
	public void run(SessionState session, QueryPlan queryPlan, JobConf job,
			Integer taskId) throws Exception {
		addPythonCode(job);
		addPythonFile(job);
		setPythonOption(job);
	}
	
	private void addPythonCode(JobConf job) {
		// TODO Auto-generated method stub
		String code = job.get(PYTHON_CODE, null);
		if (code == null) return;
		System.out.println(code);
		String base32 = Base32.encodeString(code);
		System.setProperty(PYTHON_CODE, base32);
		job.set("mapred.child.java.opts",
				job.get("mapred.child.java.opts", "") + 
					" -D" + PYTHON_CODE + "=" + base32);
	}

	private void setPythonOption(JobConf job) {
		String isCatch = job.get(PYTHON_TRY_CATCH, "false");
		String isSkipNone = job.get(PYTHON_SKIP_NONE, "false");
		System.setProperty(PYTHON_TRY_CATCH, isCatch);//for local
		System.setProperty(PYTHON_SKIP_NONE, isSkipNone);
		
		job.set("mapred.child.java.opts", //for cluster
				job.get("mapred.child.java.opts", "")
				+ " -D" + PYTHON_TRY_CATCH + "=" + isCatch
				+ " -D" + PYTHON_SKIP_NONE + "=" + isSkipNone);
		System.out.println(PYTHON_TRY_CATCH + " (python自动捕获异常)     is " + "true".equals(isCatch));
		System.out.println(PYTHON_SKIP_NONE + " (python自动跳过None参数) is " + "true".equals(isSkipNone));
	}
	
	private void addPythonFile(JobConf job) {
		String tempfiles = job.get("tmpfiles");
		
		if (tempfiles == null)
			return;
		StringBuilder bu = new StringBuilder();
		for (String path : tempfiles.split(",")) {
 			if (path == null) continue;
			if (path.endsWith(".py")) {//only one current!
				String name = path.substring(path.lastIndexOf("/")+1);
				bu.append(name).append(",");
			}
		}
		if (bu.length() > 0) {
			bu.deleteCharAt(bu.length()-1);
		}
		if (bu.length() > 0) {
			String name = bu.toString();
			System.setProperty("python_path", name);//for local
			job.set("mapred.child.java.opts", //for cluster
					job.get("mapred.child.java.opts", "") + 
						" -Dpython_path="+name);
			System.out.println("PythonHook found python file : " + name);
		}
	}
	public static void main(String[] args) {
		String path =  "file:///home/yuanhang.ghj/123/r_rpt_nz_pf_black_adzone.py";
		String name = path.substring(path.lastIndexOf("/")+1);
		System.out.println(name);
	}

}
