package chap15.book.exercise.exercise9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("blue", 86);
		map.put("blue", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore=0;
		
		for(Map.Entry<String, Integer>entry: map.entrySet()) {
			System.out.println(entry);
		}
		
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key+"="+map.get(key));
		}
		
		
		map.forEach((k,v)->System.out.println(k+"="+v));
	
		
		keySet = map.keySet();
		for(String key:keySet) {
			Integer value = map.get(key);
			
			if(value>maxScore) {
				name = key;
				maxScore = value;
			}
			totalScore+=value;
		}
		
		System.out.println("평균점수: "+(totalScore/(double)map.size()));
		System.out.println("최고점수: "+maxScore);
		System.out.println("최고아이디: "+name);
	}
	
	
	
	
	
	
	
}
