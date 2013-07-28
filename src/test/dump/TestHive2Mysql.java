package test.dump;

import dump.Hive2Mysql;
import junit.framework.TestCase;

public class TestHive2Mysql extends TestCase {
	public void testFindHDFSPath() {
		Hive2Mysql inst = new Hive2Mysql();
		String n = inst.findHDFSPath("r_rpt_tanx_ssp_adzone_base", "20130602");
		System.out.println(n);
	}
	public void testCreateHiveTable() {
		Hive2Mysql inst = new Hive2Mysql();
		inst.createHiveTable("r_rpt_tanx_ssp_adzone_base");
	}
	public void testGetColTypes() {
		Hive2Mysql inst = new Hive2Mysql();
		inst.getColTypes("r_rpt_tanx_ssp_adzone_base");
	}
	public void testInset() {
		Hive2Mysql inst = new Hive2Mysql();
		inst.insert("r_rpt_tanx_ssp_adzone_base", new String[]{"实得分数的","b","c"}, inst.getColTypes("r_rpt_tanx_ssp_adzone_base"));
	}
	
	public void testhdfs2mysql() {
		Hive2Mysql inst = new Hive2Mysql();
		inst.hdfs2mysql("hdfs://10.249.54.101:9000/group/taobao/taobao/hive_data/rpt/r_rpt_tanx_ssp_adzone_base/ds=20130601/attempt_201305301235_435133_r_000000_0",
				"r_rpt_tanx_ssp_adzone_base");
	}
}
