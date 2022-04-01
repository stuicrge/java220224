package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class App07 {
	public static void main(String[] args) {
String path = "picture1/picture/참조타입01.png";
		
		try (
				//try block에서 사용하고 꼭 닫아야하는(.close) 객체 초기화
				InputStream is = new FileInputStream(path);
				InputStream is2 = new FileInputStream("");
				InputStream is3= new FileInputStream("");
				){
	
		 
		byte []datas = new byte[100];
		int len = 0;
		int size =0;
		while((len = is.read(datas))!=-1) {
			System.out.println(Arrays.toString(datas));
			size+=len;
		}
		System.out.println(size);
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
