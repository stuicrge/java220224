package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App08 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		for(int i= 0 ; i<list.size();i++) {
			Integer origin = list.get(i);
			list.set(i, origin*2);
		}
	}
}	
