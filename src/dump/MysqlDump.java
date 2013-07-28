package dump;

import java.io.IOException;

import java.net.URI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.io.Text;


public class MysqlDump {
	public static void main(String[] args) {
		
        try {
        	Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.
			    getConnection("jdbc:mysql://dw128068.sqa.cm4.tbsite.net/test?characterEncoding=UTF-8", "hive", "hive");
			String sql = "select * from bizline";
		    ResultSet rs = conn.prepareStatement(sql).executeQuery();
		    ResultSetMetaData rsmd = rs.getMetaData();
		    StringBuilder sb = new StringBuilder();
		    
	       while (rs.next()) {
	    	    sb.append(rs.getObject(1));
	    	    
	            for (int i=2 ; i <= rsmd.getColumnCount(); i ++) { 
	            	Object col = rs.getObject(i);
	            	if (col == null) {
	            		col = "\\N";
	            	}
	            	sb.append("\001" + col);
	            }
	          
	            out(sb.toString());
	            System.out.println(sb.toString());
	            sb.setLength(0);
	        }
	       
	        writer.close();
	       
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	static SequenceFile.Writer writer = null;
	static Text key = new Text();
	static Text value = new Text();
	static {
        Configuration conf = new Configuration();
     
		conf.addResource(MysqlDump.class.getResource("/hadoop-site.xml"));
		
        String out = "hdfs://hdpnn:9000/group/tbdev/yuanhang.ghj/tmp/test/b.out";
        try {
			FileSystem fs = FileSystem.get(URI.create(out), conf);
			Path path = new Path(out);
	        writer = SequenceFile.createWriter(fs, conf, path,
	                                               key.getClass(), value.getClass());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void out(String line) {
		try {
			key.set("");
			value.set(line);
			writer.append(key, value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
