package chap10.lecture.p02try;

public class App02 {
	public static void main(String[] args) {
		String s= "java";
		String t= "spring";
		
		System.out.println(s.length());
		
		try {
			
			System.out.println(t.length());
			System.out.println("트라이 블럭 꼐속");
		}catch(NullPointerException e){
			System.out.println("발생!!");
		}
		System.out.println("프로그램 진행 계속");
	}
}
