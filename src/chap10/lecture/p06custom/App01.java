package chap10.lecture.p06custom;

public class App01 {
	public static void main(String[] args) {
		try {
			method1(200);
		} catch (ValueOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	private static void method1(int value) throws ValueOutOfBoundsException{
		// TODO Auto-generated method stub
		if(value>100) {
			throw new ValueOutOfBoundsException();
		}
		System.out.println("실행 흐름 이어감....");
	}
}
