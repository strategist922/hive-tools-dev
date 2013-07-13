package test;


import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapred.RunningJob;
import org.apache.hadoop.mapred.SequenceFileAsTextInputFormat;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;
 



public class LogMR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobConf conf = new JobConf(LogMR.class);
		conf.setJobName("<script>alert('哈哈')</script>");
		FileInputFormat.setInputPaths(conf, "/group/tbdev/yuanhang.ghj/hive/t_yh_3/*");
		FileOutputFormat.setOutputPath(conf, new Path("hdfs://hdpnn:9000/group/tbdev/yuanhang.ghj/out.test3"));
	
		conf.setInputFormat(TextInputFormat.class);
		conf.setOutputFormat(TextOutputFormat.class);
		
		conf.setMapperClass(LogMR.LogMapper.class);
		
		conf.setNumMapTasks(1);
		
		conf.setNumReduceTasks(0); 
	 
		try {
			RunningJob job = JobClient.runJob(conf);
			job.waitForCompletion();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static class LogMapper extends MapReduceBase 
	implements Mapper<LongWritable, Text, LongWritable, Text>{
		boolean i = false;
		@Override
		public void map(LongWritable byteKey, Text byteValue,
				OutputCollector<LongWritable, Text> ouput, Reporter report) throws IOException {
			if (i) return;	
			System.out.println("value" + byteValue.toString() );
			i = true;	
			ouput.collect(byteKey, byteValue);
		}
	}
	
	
	
	// key类型错误 这里只能用Text Text
	static class LogMapper2 extends MapReduceBase 
	implements Mapper<NullWritable, Text, LongWritable, Text>{
		boolean i = false;
		@Override
		public void map(NullWritable byteKey, Text byteValue,
				OutputCollector<LongWritable, Text> ouput, Reporter report) throws IOException {
			if (i) return;	
			System.out.println("value" + byteValue.toString() );
			i = true;	
			
			}
	}
	

}

