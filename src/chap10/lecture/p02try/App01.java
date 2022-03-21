package chap10.lecture.p02try;

public class App01 {
	public static void main(String[] args) {
		
		String s = "java";
		String t = null;
		
		System.out.println(s.length());
		
		try {
			//Exception이 발생할 수 있는 코드범위
			System.out.println(t.length());
			
			System.out.println("try블럭 실행 계속");
		}	catch(NullPointerException e){
			//Exception이 발생했을때 실행하는 코드
			System.out.println("널 포인터 발생");
		}
		
		System.out.println("프로그램실행...");
		
		
	}
}
