package chap18.lecture.p03reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class App01 {
	public static void main(String[] args) throws Exception {
		
		//문자 단위 입력 스트림
		String name="src/chap18/lecture/p03reader/App01.java";
		Reader rd = new FileReader(name);
		
		int ch1 = rd.read();
		int ch2 = rd.read();
		int ch3 = rd.read();
		
		System.out.println((char) ch1);
		System.out.println((char) ch2);
		System.out.println((char) ch3);
		
		rd.close();
		
	}
}
