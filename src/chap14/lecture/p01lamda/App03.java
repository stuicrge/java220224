package chap14.lecture.p01lamda;

public class App03 {
	public static void main(String[] args) {
		MyInterface3 o2 = new MyInterface3() {
			public void method1() {
				
			}
			public void method2() {
				
			}
		};

		
		// 추상메소드가 한개보다 많으면 람다식 생성 불가
//		MyInterface3 o3 = ( )->{
//			
//		};
		
		
	}
}
interface MyInterface3{
	void method1();
	void method2();
}