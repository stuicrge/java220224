package chap09.lecture.p01nested;

public class MyClass2 {
	//static 멤버에서 instance 멤버에 접근할 수 없다
	
	static class NestedClass1{
		int field1;
		static int field2;
		void method1() {
			
		}
		static void method2() {
			
		}
	}
	// instance 중첩 클래스
	class NestedClass2{
		int field1;
//		static int field2; (X)
		void method1() {
	}
//		static void method2() { (X)
//			
//		}
	
}
}