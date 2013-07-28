package test;

import java.util.ArrayList;

import org.python.util.PythonInterpreter;

public class Test {
	static int i = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int i = 1;
				i += 1;
			}
			
		}).start();;
	}
	public static int a() {
		 i ++;
		 return 1;
	}
	public static void b(int bba) {
		 
	}
}
