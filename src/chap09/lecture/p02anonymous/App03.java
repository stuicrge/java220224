package chap09.lecture.p02anonymous;

public class App03 {
	//지역클래스 만드는 과정을 생략
	//즉 클ㄹ래스가 없음(anonymous class) == 무명 클래스

	MyInterface1 o1 = new MyInterface1() {

		@Override
		public void method1() {
			System.out.println("무명 클래스에서 재정의한 메소드1");			
		}
		
	};
	
}
