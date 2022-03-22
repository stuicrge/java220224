package chap08.book.Example.s080702;

public class ChildExample {
	public static void main(String[] args) {
		ChildInterface2 ci = new ChildInterface2() {
			@Override
			public void method1() {System.out.println("I love you");}
			@Override
			public void method3() {System.out.println("I like you");}
		};
		
		ci.method1();
		ci.method2();
		ci.method3();
	}
}
