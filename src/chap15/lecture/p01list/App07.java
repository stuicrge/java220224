package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App07 {
	public static void main(String[] args) {
		//Arraylist를 만들고
		//0부터 99까지의 integer를 element로 추가
		
		List<Integer>list = new ArrayList<>();
		for(int i=0;i<100;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		List<Integer>list2 = new ArrayList<>();
		for(int i=99;i>=0;i++) {
			list.add(i);
		}
		System.out.println(list2);
	}
}
