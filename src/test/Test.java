package test;

import java.util.ArrayList;

import org.python.util.PythonInterpreter;

public class Test {
	static int i = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PythonInterpreter interp = new PythonInterpreter();
		interp.execfile("test/my.py");
		interp.exec("getlen('dfdf;fdf地方士大夫;商搜和单品二跳,费打法',1)");
		interp.exec("print '哈达'.decode('utf8')");
	}
	public static int a() {
		 i ++;
		 return 1;
	}
	public static void b(int bba) {
		 
	}
}
