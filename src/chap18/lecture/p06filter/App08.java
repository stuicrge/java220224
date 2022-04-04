package chap18.lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class App08 {
	public static void main(String[] args) throws Exception {
		String out = "output/FilterExample8.txt";
		OutputStream os = new FileOutputStream(out);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bfw = new BufferedWriter(osw);
		
		for(int i=0;i<1000;i++) {
			bfw.write('가');
			
		}
			
		bfw.close();
		osw.close();
		os.close();
		System.out.println("종료!!");
	}
}
