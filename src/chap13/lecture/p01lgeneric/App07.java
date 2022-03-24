package chap13.lecture.p01lgeneric;

public class App07 {

}
interface MyInterface7<T>{
	public void method(T param);
}
//제네릭 타입 상속이나 구현시 하위 클래스도 제네릭타입
class MyClass1<T> implements MyInterface7<T>{
	@Override
	public void method(T param) {
		// TODO Auto-generated method stub
		
	}
}
// 하위 클래스에 타입파라미터 추가기능
class MyClass2<T,U> implements MyInterface7<T>{
	@Override
	public void method(T param) {
		// TODO Auto-generated method stub
		
	}
}
class MyClass3 implements MyInterface7<String>{
	@Override
	public void method(String param) {
		// TODO Auto-generated method stub
		
	}
}







