package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App05 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("spring");
		list1.add("jsp");
		list1.add("vue");
		
		int length = list1.size();
		System.out.println(length);
		
		boolean empty = list1.isEmpty();
		System.out.println(empty);
		
		list1.clear();
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
	}
}
