package chap09.lecture.p02anonymous;

public class MyClass1 implements MyInterface1{

	@Override
	public void method1() {
		// 추상메소드와 다를것 없는 인터페이스 메소드 재정의
		System.out.println("마이클래스1에서 재정의한 메소드1");
	}

}
