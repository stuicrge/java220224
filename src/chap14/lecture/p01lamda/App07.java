package chap14.lecture.p01lamda;

public class App07 {
	public static void main(String[] args) {
		
		MyInterface7 o1 = () -> System.out.println(args.length);
		
	}
}
interface MyInterface7{
	void method();
}