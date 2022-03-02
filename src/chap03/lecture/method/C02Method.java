package chap03.lecture.method;

public class C02Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("명령문1");
		myMethod1(300);
		System.out.println("명령문2");
		myMethod1(3);
		System.out.println("명령문3");
		
	}
	
	public static void myMethod1(int i) {
	
		System.out.println("마이 메 소 드 1");
		System.out.println("파라미터 i의 값:"+i);
	}
}
