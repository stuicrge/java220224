package chap03.lecture.method;

public class C06Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = flip(true);
		System.out.println(a);
		
		System.out.println(flip(false));
		System.out.println(makeDouble(3));
		System.out.println(makeDouble(9));
		System.out.println(sum(3,6));
		System.out.println(sum(5,5));
	}

	public static boolean flip(boolean b) {
		return !b;
	}
	public static int makeDouble(int i) {
		return i*2;
	}
	public static int sum(int i, int j) {
		return i+j;
	}
	
}
