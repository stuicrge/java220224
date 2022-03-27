package chap14.lecture.p01lamda;

public class App06 {
	public static void main(String[] args) {
		int local = 0; // final or effectively final
		MyInterface6 o1 = new MyInterface6() {
			@Override
			public void method1() {
				System.out.println(local);
			}
		};
		MyInterface6 o2  = () -> System.out.println(local);
	}
}
interface MyInterface6
{
	void method1();
}