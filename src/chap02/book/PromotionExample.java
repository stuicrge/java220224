package chap02.book;

public class PromotionExample {//자동타입변환

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValue = byteValue; // int <= byte
		System.out.println(intValue);
		
		char charValue='가';
		intValue = charValue; // int <= char
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue; // long <= int
		System.out.println(longValue);
		
		intValue = 300;
		double doubleValue = intValue; // double <= int
		System.out.println(doubleValue);
	}

}
