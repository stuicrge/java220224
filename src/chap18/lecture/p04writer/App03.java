package chap18.lecture.p04writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class App03 {
	public static void main(String[] args) throws Exception {
		// 그림파일 복사
		// Reader Writer (X) 
		String origin = "picture1/picture/참조타입02.png";
		String copy = "output/참조타입02_copy.png";
		
		Reader rd = new FileReader(origin);
		Writer wr = new FileWriter(copy);
		
		int len=0;
		while((len=rd.read())!=-1) {
			wr.write(len);
		}
		wr.flush();
		wr.close();
		rd.close();
		System.out.println("복사완료!");
	}
}
