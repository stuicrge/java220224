package chap18.lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App04 {
	public static void main(String[] args) {
		
		String inputfile="picture1/picture/참조타입01.png";
		String outputfile="output/참조타입01.png";
		
		try(InputStream is = new FileInputStream(inputfile);
				OutputStream os = new FileOutputStream(outputfile);){
			
			int len=0;
			while((len = is.read())!=-1) {
				os.write(len);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
	}
}
