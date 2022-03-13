package chap6.lecture.p05static;

public class App01 {
	public static void main(String[] args) {
	Myclass01 o1 = new Myclass01();
	o1.age=5;
	o1.method1();
	
	Myclass01.height=100;
	Myclass01.method2();
}
}
