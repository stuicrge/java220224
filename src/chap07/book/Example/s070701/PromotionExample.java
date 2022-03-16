package chap07.book.Example.s070701;

class A{}

class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}


public class PromotionExample {
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		
		// B와 E는 아무 상속관계가 없고  C 와 D 역시 아무 상관관계가 없다.
		//B b3 =e;
		//C c2 = d;
		
	}
}
