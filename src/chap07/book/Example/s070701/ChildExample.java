package chap07.book.Example.s070701;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3() (X) Parent타입으로 변환된이후엔 Child 타입만 가진 method3를 호출할 수 없다
	}
}
