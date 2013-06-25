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



public class LogMRNullKey {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobConf conf = new JobConf(LogMRNullKey.class);//�����ǰ�LogMR���͵�hdfs�й���,����Ҫ��setjar
		conf.setJobName("etl_processor");
		FileInputFormat.setInputPaths(conf, "/group/tbads/logdata/union_athena/20130410/00/00/host/48-d784f220-aaca-4eaa-9bba-8fd398505e46.log");
		FileOutputFormat.setOutputPath(conf, new Path("hdfs://hdpnn:9000/group/tbdev/yunrui/out.test"));
 
		conf.setInputFormat(org.apache.hadoop.mapred.SequenceFileInputFormat.class);
		conf.setOutputFormat(org.apache.hadoop.mapred.SequenceFileOutputFormat.class);
		
		conf.setMapperClass(LogMRNullKey.LogMapper.class);
		conf.setNumMapTasks(1);
		
		conf.setNumReduceTasks(0);//mapred.reduce.tasks Ĭ�϶�����? �����ļ�? 
		
		
		try {
			RunningJob job = JobClient.runJob(conf);
			job.waitForCompletion();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static class LogMapper extends MapReduceBase 
	implements Mapper<LongWritable, Text, NullWritable, Text>{

		@Override
		public void map(LongWritable key, Text value,
				OutputCollector<NullWritable, Text> ouput, Reporter report) throws IOException {
			// TODO Auto-generated method stub
			
			 
			ouput.collect(NullWritable.get(),value );//���Ϊ0 ^I value
			
			System.out.println("key " +  key.get());
			System.out.println("value "  + value.toString());
			
			System.exit(1);
			
			}
	}
	
	
}

