package chap03.lecture.method;

public class C03Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod1(300);
		myMethod1(900);
		//myMethod1(3.14);  X int형이라 했으니 3.14가 들어갈수가없다
		myMethod1('가');
		
		int j = 999;
		myMethod1(j);
	}
	
	public static void myMethod1(int i) {
		System.out.println(i);
	}

}
