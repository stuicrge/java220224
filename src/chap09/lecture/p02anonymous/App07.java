package chap09.lecture.p02anonymous;

public class App07 {
	public static void main(String[] args) {
		int var = 7; // == final int var 중간에 값을 변경하려 하면 안됌
		MyInterface1 o1 = new MyInterface1() {

			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println(var);
			}
			
		};
		o1.method1();
	}
}
