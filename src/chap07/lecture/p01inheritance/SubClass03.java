package chap07.lecture.p01inheritance;

public class SubClass03 extends SuperClass03 {
	
	public SubClass03(){
//		super();
		// 상위(부모) 클래스의 파라미터가 빈 () 생성자가 없으면
		// 파라미터 있는 생성자를 명시적으로 호출해야함.
		super("param");
		System.out.println("subclass3 no-args constructor");
	}
	
	public SubClass03(int i) {
//		super();
		super("ppp");
		System.out.println("subclass03 int-param constructor");
	}
	
}
