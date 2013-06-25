package python;

import org.apache.hadoop.hive.ql.QueryPlan;
import org.apache.hadoop.hive.ql.hooks.PreJobHook;
import org.apache.hadoop.hive.ql.session.SessionState;
import org.apache.hadoop.mapred.JobConf;
import org.python.util.PythonInterpreter;

public class PythonConf implements PreJobHook {
    public final static String PYTHON_TRY_CATCH = "python.try.catch";
    public final static String PYTHON_SKIP_NONE = "python.skip.none";
	public final static String PYTHON_CODE = "python";//set参数的方式传入代码
	
    public boolean isSkipNone = false;
    public boolean isTryCatch = false;
    /**
     * 编译时获取配置
     */
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
		//测试执行
		new PythonInterpreter().exec(code); 
		//成功后代码传入配置
		String base32 = Base32.encodeString(code);
		add2System(job, PYTHON_CODE, base32);
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
            if (path.endsWith(".py")) {
            	//尝试执行
            	if (path.startsWith("file://")) {
            		new PythonInterpreter().execfile(path.substring("file://".length())); 
            	}
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
            System.out.println("PythonConf found python file : " + name);
        }
    }
    
   /**
    *  采用子jvm参数的方式,传递参数到集群机器中.
    * @param job
    * @param tag
    * @param value
    */
    private void add2System(JobConf job, String tag, String value) {
		System.setProperty(tag, value);
		job.set("mapred.child.java.opts",
				job.get("mapred.child.java.opts", "") + 
					" -D" + tag + "=" + value);
    }
    
    /**
     * 初始化子jvm运行时的Conf参数
     */
    public void ini() {
        if ("true".equals(System.getProperty(PYTHON_SKIP_NONE)))
            isSkipNone = true;
        if ("true".equals(System.getProperty(PYTHON_TRY_CATCH)))
            isTryCatch = true;
    }


}
