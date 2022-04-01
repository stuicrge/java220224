package chap18.lecture.p05file;

import java.io.File;

public class App01 {
	public static void main(String[] args) {
		String path = "src/chap18/lecture/p05file/App01.java";
		File file = new File(path);
		
		//exists : file이 존재하는가	
		System.out.println(file.exists());
		//isDirectory : directory?인가
		System.out.println(file.isDirectory());
		//isFile: File인가?
		System.out.println(file.isFile());
		//length: file크기
		System.out.println(file.length());
	}
}
