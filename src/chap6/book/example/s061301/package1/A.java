package chap6.book.example.s061301.package1;

public class A { //default == package private, 같은 패키지내에서만 통함
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public A(boolean b) {}
	A(int b) {}
	private A(String s) {}
}
