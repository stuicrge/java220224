package chap08.lecture.p02polymorphism;

public class App01 {
	public static void main(String[] args) {
		//자동 형변환
		
		
		MyClass1 o1 = new MyClass1();
		MyInterface1 i1 = o1; //자동 형변환
		
		System.out.println(i1==o1);
		
		MyInterface1 i2 = new MyClass1();
	
		method1(o1); //자동 형변환
		method1(i1);
		method1(new MyClass1()); // 자동 형변환
		method1(i2);
	}
	
	public static void method1(MyInterface1 param) {
		
	}
}

interface MyInterface1{
	
}
class MyClass1 implements MyInterface1{
	
}