package chap07.book.Example.s070705;

public class ChildExample {
	
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// 자식클래스에만 있는 메소드와 필드 parent를 통해 호출할 수 없다
//	parent.field2 = "data2";
//	parent.method3();
		
		Child child = (Child)parent;
		child.field2 = "yyy";
		child.method3();
		
	}
	
}
