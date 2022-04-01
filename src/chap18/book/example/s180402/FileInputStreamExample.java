package chap18.book.example.s180402;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"C:/JavaProgramming/source/chap18/src/sec04/exam02_fileinputstream/FileInputStreamExmaple.java"
					);
			int data;
			while((data=fis.read())!=-1) {
				System.out.println(data);
			}
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
