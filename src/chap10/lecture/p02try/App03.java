package chap10.lecture.p02try;

public class App03 {
	public static void main(String[] args) {
		int i = 2;
		int j = 0;
		
		try {
			int k = i/j;
			System.out.println("몫: "+k);
		}catch(ArithmeticException e) {
			System.out.println("잘못된 연산");
		}
		System.out.println("프로그램 실행");
	}
}	
