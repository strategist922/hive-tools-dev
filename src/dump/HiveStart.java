package dump;

import java.io.InputStream;
import java.util.Scanner;


public class HiveStart {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String px = "";
		while ((px = scan.nextLine())!=null) {
			Process p = Runtime.getRuntime().exec(px);
			System.out.println("run ");
			InputStream input = p.getErrorStream();
			byte[] buff = new byte[133];
			int len;
			while((len=input.read(buff)) > 0 ){
				System.out.print(new String(buff, 0, len));
			}
			input = p.getInputStream();
			while((len=input.read(buff)) > 0 ){
				System.out.print(new String(buff, 0, len));
			}
			p.waitFor();
		}
	}
	
}
