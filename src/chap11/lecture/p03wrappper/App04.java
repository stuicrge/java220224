package chap11.lecture.p03wrappper;

public class App04 {
	public static void main(String[] args) {
		Integer i1 = new Integer(999);
		Integer i2 = new Integer(999);
		
		int i4 =i1;
		int i5= i2;
		
		System.out.println(i4==i5);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));//참조타입 비교시 무조건 equals!
	
	}
}
