package chap15.lecture.p02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App01 {
	public static void main(String[] args) {
		//set : 순서없고 중복 없음
		//구현클래스:HashSet
		
		Set<String> set = new HashSet<>();
		set.add("jimin");
		set.add("suga");
		set.add("jim");
		set.add("rm");
		
		System.out.println(set.size());
		set.add("rm");
		//중복허용 X
		System.out.println(set.size());
		
		//탐색
		//for , Iterator문 사용 , get은 사용할 수 없다
		for(String item:set) {
			System.out.println(item);
		}
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//remove
		set.remove("rm");
		System.out.println(set.size());
		set.remove("winter");
		System.out.println(set.size());
		
		System.out.println(set.contains("rm"));
		System.out.println(set.contains("jimin"));
		
		
		
		
		
		
		
	}
}	
