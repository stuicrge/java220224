package chap03.lecture.method;

public class C05Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("명령문1");
		System.out.println("명령문2");
		int i = myMethod2();
		System.out.println("명령문3");
		System.out.println(i);
		
	}
	
	public static void myMethod1() {
		System.out.println("my method1 명령문");
		System.out.println("my method1 명령문2");
		
		// return : 1 메소드 종료 , 2 오른쪽에 있는 값을 호출한 곳으로 반환
		return;
		//System.out.println("명령문 3");
	}
	public static int myMethod2() {
		// 메소드명 앞에 리턴하는 값의 타입을 명시
		// 만약 리턴하는 값이 없으면 void로 명시
		System.out.println("my method2 명령문");
		return 3;
	}
}
