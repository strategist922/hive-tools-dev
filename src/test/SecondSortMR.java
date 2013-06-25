package test;


import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Partitioner;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapred.RunningJob;
import org.apache.hadoop.mapred.SequenceFileAsTextInputFormat;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;
 



public class SecondSortMR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobConf conf = new JobConf(SecondSortMR.class);
		conf.setJobName("etl_processor");
		FileInputFormat.setInputPaths(conf, "hdfs://hdpnn:9000/group/tbdev/yuanhang.ghj/hive_data/ods/s_dw_log_cm_pv/ds=20120918");
		Path output = new Path("hdfs://hdpnn:9000/group/tbdev/yuanhang.ghj/second.test2");
		try {
			FileSystem fs = FileSystem.get(conf);
			FileSystem.get(conf).delete(output);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		FileOutputFormat.setOutputPath(conf, output);
		conf.setInputFormat(TextInputFormat.class);
		conf.setOutputFormat(TextOutputFormat.class);
		
		conf.setMapperClass(SecondSortMR.LogMapper.class);
		conf.setReducerClass(SecondSortMR.LogReducer.class);
		
		conf.setMapOutputKeyClass(Text.class);
		conf.setMapOutputValueClass(Text.class);
		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(Text.class);
		
		
		conf.setNumMapTasks(1);
		conf.setNumReduceTasks(1); 
		
		conf.setOutputValueGroupingComparator(SecondSortMR.Grouper.class);
	 	conf.setOutputKeyComparatorClass(SecondSortMR.KeyGrouper.class);
		
		conf.set("mapred.job.tracker", "local");
		conf.set("fs.default.name", "file:///");
		//conf.set("mapred.child.java.opts", " -Xdebug -Xrunjdwp:transport=dt_socket,address=8782,server=y,suspend=y");
		try {
			RunningJob job = JobClient.runJob(conf);
			job.waitForCompletion();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static class LogMapper extends MapReduceBase 
	implements Mapper<LongWritable, Text, Text, Text>{
		boolean i = false;
		@Override
		public void map(LongWritable lkey, Text value,
				OutputCollector<Text, Text> ouput, Reporter report) throws IOException {
			Text key = new Text();
			Text v = new Text();
			key.set("1_a_k");
			v.set("1_a_v");
			ouput.collect(key, v);
			key.set("1_b_k");
			v.set("1_b_v");
			ouput.collect(key, v);
			key.set("2_a_k");
			v.set("2_a_v");
			ouput.collect(key, v);
			key.set("2_b_k");
			v.set("2_b_v");
			ouput.collect(key, v);
			
		}
	}
	
	static class LogReducer extends MapReduceBase
	implements Reducer<Text, Text, Text, Text> {
		@Override
		public void reduce(Text key, Iterator<Text> values,
				OutputCollector<Text, Text> output, Reporter reporter)
				throws IOException {
			while(values.hasNext()) {
				output.collect(key, values.next());
			}
		}
		
	}
	
	static class KeyPartitioner implements
	Partitioner<Text,Text> {

		@Override
		public void configure(JobConf job) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getPartition(Text key, Text value, int numPartitions) {
			// TODO Auto-generated method stub
			return key.toString().split("_")[0].hashCode() % numPartitions;
		}
		
	}
	
	static class Grouper implements RawComparator<Text> {
		Text o1 = new Text();
		Text o2 = new Text();
		@Override
		public int compare(Text o1, Text o2) {
			// TODO Auto-generated method stub
			return o1.toString().split("_")[0].hashCode() - o2.toString().split("_")[0].hashCode();
		}

		@Override
		public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
			// TODO Auto-generated method stub
			o1.set(b1, s1, l1);
			o2.set(b2, s2, l2);
			return compare(o1, o2);
		}
	}
	
	static class KeyGrouper implements RawComparator<Text> {
		Text o1 = new Text();
		Text o2 = new Text();
		@Override
		public int compare(Text o1, Text o2) {
			// TODO Auto-generated method stub
			int par1 =  o1.toString().split("_")[0].hashCode() - o2.toString().split("_")[0].hashCode();
			if (par1 != 0)
				return par1;
			return o1.toString().split("_")[1].hashCode() - o2.toString().split("_")[1].hashCode();
		}

		@Override
		public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
			// TODO Auto-generated method stub
			o1.set(b1, s1, l1);
			o2.set(b2, s2, l2);
			return compare(o1, o2);
		}
		
	}

	

}

