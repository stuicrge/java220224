package chap15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

	public class App01 {
		
		public static void main(String[] args) {
			// Map: (key,value)쌍으로 저장
			//key,value : entry, entry는 순서가 없다
			//key는 중복안됨
			
			Map<String , String> map = new HashMap();
		
			//put : entry추가
			map.put("bts","boy group");
			map.put("aespa","girl group");
			map.put("testla", "car");
			map.put("testla","elon musk");
			
			//size : entry수
			int size = map.size();
			System.out.println(size);
			
			//get key를사용하여 value를 얻는다
			String val1=map.get("bts");
			String val2=map.get("aespa");
			String val3=map.get("testla");
			System.out.println(val1);
			System.out.println(val2);
			System.out.println(val3);
			
			//keySet : key를 Set타임으로 리턴
			Set<String> keys = map.keySet();
			System.out.println(keys);
			
			System.out.println();
			
			//전체 탐색
			Set<String> set1 = map.keySet();
			for(String key : set1) {
				String value = map.get(key);
				
				System.out.println(key+":"+value);
			}
			
			//전체탐색 2
			Set<Map.Entry<String, String>>entries=map.entrySet();
	
			for(Map.Entry<String, String> entry:entries) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		
		//remove
		map.remove("testla");
		System.out.println(map.size());
		System.out.println(map);
		
		
		//containsKey : remove한 후 key가 있는지 확인
		System.out.println(map.containsKey("aespa"));
		System.out.println(map.containsKey("testla"));
		
		
		
		
		
		}
		
		
		
}
