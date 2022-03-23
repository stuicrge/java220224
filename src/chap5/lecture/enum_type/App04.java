package chap5.lecture.enum_type;

public class App04 {
	
	public static void main(String[] args) {
		
		Season s1 = Season.SPRING;
		Season s2 = Season.SUMMER;
		Season s3 = Season.FALL;
		Season s4 = Season.WINTER;
		
		System.out.println(s1.ordinal());
		System.out.println(s2.ordinal());
		System.out.println(s3.ordinal());
		System.out.println(s4.ordinal());
		
		String str1 = s1.toString();
		System.out.println(str1);
		System.out.println(s2);
		
		Season s5 = Season.valueOf("SUMMER");
		Season[] arr = Season.values();
		System.out.println(arr.length);
		
		for(Season season:arr) {
			System.out.println(season);
		}
	}
}
