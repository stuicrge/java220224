package chap13.lecture.p01lgeneric;

import java.util.ArrayList;
import java.util.List;

public class App08 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("spring");
		
		String e1 = list1.get(0);
		String e2 = list1.get(1);
		
		System.out.println(e1);
		System.out.println(e2);
		
		List<String> list2 = list1;
//		ArrayList<Object> list3 = list1;(X)오류발생 // ArrayList<String>은 ArrayList<Object>의 하위타입은 아니다
		
	}
}
