package chap03.lecture.method;

public class C04Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//myMethod1();
		//myMethod1(3);
		myMethod1(3,5);
		myMethod2(10 , 20);
		
		
	}
	
	public static void myMethod1(int i, int j) {
		System.out.println(i);
		System.out.println(j);
	}
	//파라미터명 : lowerCamelCase
	public static void myMethod2(int age, int height) {
		System.out.println(age*2);
		System.out.println(height*3);
	}
	
	public static void myMethod3(int i, boolean b, long l, double d) {
		
		
	}
	
}
