package chap09.book.Example.s090203;

public class A {
	A(){System.out.println("A 객체가 생성됨");}
	
	class B {
		B() {System.out.println("B 객체가 생성됨");}
		int field1;
//		static int field2;
		void method1() {}
//		static void method2() {}
	}
}
