package chap02.lecture;

public class C12TypeConversion {
	public static void main (String[] args) {
		
		// 정수끼리의 연산시 타입은 int
		int i1 = 30;
		int i2 = 20;
		
		System.out.println(i1+i2);
		
		byte b1 =3;
		byte b2 =4;
		
		
		System.out.println(b1+b2);
		
		short s1 = 1000;
		short s2 = 2000;
		short s3 = (short) (s1+s2);
		int i4 = s1+s2;
		
		System.out.println(s3);
		System.out.println(i4);
		
		//서로 다른 타입끼리 연산시 결과 : 더 byte가 큰타입
		long l4 = 1000000;
		int i5=1000000;
		long l5 = l4+i5;
		int i6 = (int)(l4+i5);
		
		System.out.println(l5);
		System.out.println(i6);
		
		//각 타입의 최소값 최댓값
		//byte
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(- Float.MIN_VALUE);
		System.out.println(- Float.MAX_VALUE);
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(-Double.MIN_VALUE);
		System.out.println(-Double.MIN_VALUE);
		
	}
}
