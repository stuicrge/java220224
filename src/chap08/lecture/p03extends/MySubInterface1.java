package chap08.lecture.p03extends;

public interface MySubInterface1 extends MySuperInterface1,MySuperInterface2{
	
	void subMethod1();
	
	@Override
	default void superDefaultMethod1() {
		// TODO Auto-generated method stub
		System.out.println("서브 인터페이스에서 재정의한 디폴트 메소드");;
	}
}
