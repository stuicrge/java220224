package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App06 {
	public static void main(String[] args) {
		// List 탐색방법
		List<String> list = new ArrayList<>();
		list.add("spring");
		list.add("java");
		list.add("hello");
		list.add("lunch");
		
		System.out.println("그냥 for문");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("향상 for문");
		for(String element : list) {
			System.out.println(element);
		}
		
		System.out.println("forEach");
		list.forEach(e->System.out.println(e));
		
		System.out.println("Iteraotr");
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.hasNext());
		}
		
		
		
	}
}	
