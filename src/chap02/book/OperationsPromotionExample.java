package chap02.book;

public class OperationsPromotionExample {//연산식에서 자동 형변환

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1= 10;
		byte byteValue2= 20;
		// 정수의 연산식에서 결과는 무조건 int형이야한다.
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue = 'A';
		char charValue2 = '1';
		
		int intValue2 = charValue+charValue2;
		System.out.println(intValue2);
		//실수의 연산식에선 무조건 결과는 double형이여야한다
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int inValue5 = 10;
		double doubleValue = intValue4 / 4.0;
		System.out.println(doubleValue);
	}

}
