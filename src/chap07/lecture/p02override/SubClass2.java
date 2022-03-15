package chap07.lecture.p02override;

public class SubClass2 extends SuperClass2 {
	
	@Override
	public void method1() {
		super.method1();
		System.out.println("서브클래스2의 메소드 1 이 하는일...");
		
		System.out.println("또 다른 일..");
	}
}
