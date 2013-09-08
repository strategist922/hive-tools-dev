package dump;

import java.io.IOException;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import com.google.common.base.Strings;


public class Hive2Mysql {
	final static int VARCHAR_LEN = 800;
	final static String NULL_IN_HIVE = "\\N";
	
	String metaurl = "jdbc:mysql://10.232.128.68/new_tbdev_hive?characterEncoding=UTF-8";
	String user = "hive";
	String pass = "hive";
	

	String newDB = "test";
	String newDBurl = "jdbc:mysql://10.232.128.68/" + newDB + "?characterEncoding=UTF-8&amp;createDatabaseIfNotExist=true";
	

	Connection metaconn = null;
	Connection newDBconn = null;
	public Hive2Mysql() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			metaconn = DriverManager.getConnection(metaurl, user, pass);
			newDBconn = DriverManager.getConnection(newDBurl, user, pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 *  从hive表倒入mysql表
	 * @param hivetable
	 * @param partition
	 * @param mysqltable
	 */
	public void hive2mysql(String hivetable, String partition, String mysqltable) {
		String dir = findHDFSPath(hivetable, partition);
		hdfs2mysql(dir,mysqltable);
	}
	/**
	 * 从mysql导入hive表
	 * @param mysqltable
	 * @param hivetable
	 * @param partition
	 */
	public void mysql2hive(String mysqltable, String hivetable, String partition) {
		String dir = findHDFSPath(hivetable, null);
		try {
			String filepath = mysql2hdfs(mysqltable, dir);
			//TODO 登记到hive表中
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private String mysql2hdfs(String mysqltable, String dir) throws Exception {
		// TODO Auto-generated method stub
		Configuration conf = new Configuration();
		//加载特定的hadoop-site.xml
		conf.addResource(Hive2Mysql.class.getResource("/hadoop-site.xml"));
		FileSystem sfs = FileSystem.newInstance(conf);
		String filepath = dir + "/" + new Random().nextInt(1000);
		Path path = new Path(filepath);
		Text key = new Text();
		Text value = new Text(); 
		SequenceFile.Writer writer =  SequenceFile.createWriter(sfs, conf, path, Text.class, Text.class);

		
		String sql = "select * from " + mysqltable;
	    ResultSet rs = newDBconn.prepareStatement(sql).executeQuery();
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
          
			value.set(sb.toString());
			writer.append(key, value);
			
            sb.setLength(0);
        }
        return filepath;
	}
	
	/**
	 * 倒云梯文件入mysql
	 * @param hdfspath
	 * @param mysqltable
	 */
	public void hdfs2mysql(String hdfspath, final String mysqltable) {
		final Configuration conf = new Configuration();
		//加载特定的hadoop-site.xml
		conf.addResource(Hive2Mysql.class.getResource("/hadoop-site.xml"));
		final FileSystem fs;
		try {
			fs = FileSystem.get(URI.create(hdfspath), conf);
			Path path = new Path(hdfspath);
			List<Path> listpath = new ArrayList<Path>();
			if (fs.getFileStatus(path).isDir()) {
				FileStatus[] listStatus = fs.listStatus(path);
				if (listStatus != null)
				for (FileStatus s : listStatus) {
					listpath.add(s.getPath());
				}
			} else {
				listpath.add(path);
			}
			
			final String[] types = getColTypes(mysqltable);
			
			ExecutorService executor = Executors.newFixedThreadPool(10);
			
			CountDownLatch  barr = new CountDownLatch(listpath.size());
			
			for (final Path subPath : listpath) {
				System.out.println("run  " + subPath);
				executor.submit(new  HDFSReader(barr, subPath, mysqltable, types));
			}
			
			barr.await();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	class HDFSReader implements Runnable {
		private CountDownLatch  barr;
		private String mysqltable;
		private Path path;
		private String[] types;

		public HDFSReader (CountDownLatch  barr, Path path, String mysqltable, String[] types) {
			this.barr = barr;
			this.path = path;
			this.mysqltable = mysqltable;
			this.types = types;
		}
		
		@Override
		public void run() {
			System.out.println("run  in " + path);
			try {
				Configuration conf = new Configuration();
				//加载特定的hadoop-site.xml
				conf.addResource(Hive2Mysql.class.getResource("/hadoop-site.xml"));
				FileSystem sfs = FileSystem.newInstance(conf);//多线程不能使用这个单实例FileSystem.cache
				SequenceFile.Reader reader = new SequenceFile.Reader(sfs, path, conf);
				Writable  key = (Writable) reader.getKeyClass().newInstance();
				Writable val = (Writable) reader.getValueClass().newInstance();
				int count = 0;
				while (reader.next(key, val)) {
					if (val instanceof Text) {
						Text text = (Text)val;
						String[] arr = text.toString().split("\001");//TODO 这里要使用特定的serde
						insert(mysqltable, arr, types);
						count++;
					}
				}
				barr.countDown();
				System.out.println("run out " + count);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 *  获取mysql表中的字段类型
	 * @param tablename
	 * @return 目前string， int ，double
	 */
	public String[] getColTypes(String tablename) {
		try {
			PreparedStatement statement = newDBconn.prepareStatement("select * from " + tablename + " limit 1");
			ResultSet rs = statement.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			String[] types = new String[rsmd.getColumnCount()];
            for (int i=1 ; i <= rsmd.getColumnCount(); i ++) {
            	String type = rsmd.getColumnTypeName(i);
            	//System.out.println(type);
            	if (type.equals("VARCHAR")) {
            		types[i-1] = "string";
            	} else if (type.equals("INTEGER") || type.equals("BIGINT")) {
            		types[i-1] = "int";
            	} else if (type.equals("DOUBLE")) {
            		types[i-1] = "double";
            	}
            }
			return types;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 插入一条记录
	 * @param tablename
	 * @param vars
	 * @param fieldtypes
	 */
	public synchronized void insert(String tablename, String[] vars, String[] fieldtypes) {
		
		 String vlist = Strings.repeat("?,", fieldtypes.length)
				 			.substring(0, 2 * fieldtypes.length -1 );
		 
		 String sql = "insert into " + tablename + " values (" + vlist + ")";
		 try {
			 PreparedStatement ps = newDBconn.prepareStatement(sql);
 			 for (int i=0; i < fieldtypes.length; i++) {
				 if (i < vars.length) {
					 if (fieldtypes[i].equals("string")) {
						 if (NULL_IN_HIVE.equals(vars[i])) 
							 ps.setNull(i+1, java.sql.Types.VARCHAR);
						 else {
							 if (vars[i].length() > VARCHAR_LEN) {
								 vars[i] = vars[i].substring(0,VARCHAR_LEN);
							 }
							 ps.setString(i+1, vars[i]);
						 }
					 } else if (fieldtypes[i].equals("int")) {
						 if (NULL_IN_HIVE.equals(vars[i]))  
							 ps.setNull(i+1, java.sql.Types.INTEGER);
						 else 
							 ps.setInt(i+1, Integer.parseInt(vars[i]));
					 } else if (fieldtypes[i].equals("double")) {
						 if (NULL_IN_HIVE.equals(vars[i])) 
							 ps.setNull(i+1, java.sql.Types.DOUBLE);
						 else 
							 ps.setDouble(i+1, Double.parseDouble(vars[i]));
					 }
				 } else {
					 if (fieldtypes[i].equals("string")) {
						 ps.setNull(i+1, java.sql.Types.VARCHAR);
					 } else if (fieldtypes[i].equals("int")) {
						 ps.setNull(i+1, java.sql.Types.INTEGER);
					 } else if (fieldtypes[i].equals("double")) {
						 ps.setNull(i+1, java.sql.Types.DOUBLE);
					 }
				 }
			 }
			 ps.execute();
			 ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(sql + "\n error when insert this row: " + Arrays.toString(vars));
			e.printStackTrace();
		}

		 
		 
	}
	/**
	 * 获取hive表特定分区的hdfs路径。
	 * @param tablename
	 * @param partition 支持分区值，单个。例如20130315。可以为null，则无分区表
	 * @return
	 */
	public String findHDFSPath(String tablename, String partition) {
		String sql;
		if (partition == null || "".equals(partition)) { //无分区的表
			sql = "SELECT S.LOCATION FROM TBLS T join SDS S " +
					"WHERE T.SD_ID = S.SD_ID AND T.TBL_NAME = " + tablename;
		} else {
			sql = String.format(" SELECT S.LOCATION " +
            "FROM TBLS T,PARTITIONS P, SDS S, PARTITION_KEY_VALS PK" +
           " WHERE T.TBL_ID = P.TBL_ID" +
           "  AND P.SD_ID = S.SD_ID" +
           "  AND P.PART_ID = PK.PART_ID" +
           "  AND T.TBL_NAME = '%s'" +
           " AND substring(PK.PART_KEY_VAL,1,8) = %s", tablename, partition);
		}
		ResultSet rs;
		try {
			rs = metaconn.prepareStatement(sql).executeQuery();
			if (rs.next()) {
				return rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 建实体表。从hive元数据中获取。
	 * @param tablename
	 */
	public void createHiveTable(String tablename) {
		try {
			PreparedStatement prepareStatement = metaconn.prepareStatement(
				"SELECT concat('  ',C.COLUMN_NAME,'    ',"
	                   + " CASE WHEN C.TYPE_NAME = 'string' then 'VARCHAR(" + VARCHAR_LEN + ")' " 
	                   + "  WHEN C.TYPE_NAME = 'bigint' then 'BIGINT' " 
	                   + "  WHEN C.TYPE_NAME = 'double' then 'DOUBLE(12,4)' " 
	                   + " ELSE 'DECIMAL(5,2)' END,"
	                   + " ',')   "                      
	                   + " FROM TBLS T,COLUMNS C   "                                                        
	                   + "  WHERE T.TBL_NAME  = ? "                                                        
	                   + "  AND T.SD_ID = C.SD_ID        "                                                       
	                   +"   ORDER BY INTEGER_IDX " );
			
			prepareStatement.setString(1, tablename);
			ResultSet rs = prepareStatement.executeQuery();
			StringBuilder sb = new StringBuilder();
			while (rs.next()) {
				sb.append(rs.getString(1)).append('\n');
			}
			sb.setCharAt(sb.length() - 2, ' ');//为了删除最后一个逗号
			rs.close();
			String tablebody = sb.toString();
			
			String createTableSql = String.format("create table if not exists %s (%s) CHARSET=UTF8", tablename, tablebody);
			System.out.println(createTableSql);
			newDBconn.prepareStatement(createTableSql).execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Hive2Mysql inst = new Hive2Mysql();
		inst.hive2mysql("r_rpt_tanx_ssp_adzone_base", "20130601",
				"r_rpt_tanx_ssp_adzone_base");
		
	}
}
