package chap18.lecture.p06filter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class App06 {
	public static void main(String[] args) throws Exception {
		copyNormal();
	}

	private static void copyNormal() throws Exception {
		// TODO Auto-generated method stub
		String src = "out/FilterExample51.txt";
		String des = "output/FilterExample6.txt";
		
		Reader rd = new FileReader(src);
		Writer wr = new FileWriter(des);
		
		int data = 0;
		while((data = rd.read())!=-1) {
			wr.write(data);
		}
		wr.close();
		rd.close();
	}
}
