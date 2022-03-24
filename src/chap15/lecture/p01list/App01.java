package chap15.lecture.p01list;

import java.util.ArrayList;

public class App01 {
//	list: 순서가 있고 , 중복 저장이 가능
	//구현 클래스 : arraylist
	public static void main(String[] args) {
		
		ArrayList<String>list1 = new ArrayList<>();
		list1.add("java");
		list1.add("spring");
		list1.add("jsp");
		
		String e1 = list1.get(0);
		String e2 = list1.get(1);
		String e3 = list1.get(2);
		
		
		int length = list1.size();
		System.out.println(length);
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
	
		for(String str:list1) {
			System.out.println(str);
		}
	
	}
		
}
