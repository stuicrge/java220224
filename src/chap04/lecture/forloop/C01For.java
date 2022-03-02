package chap04.lecture.forloop;

public class C01For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("stmt 1");
		//1번 초기값
		//2번 조건		
		//4번 증감
		
		//3번 코드블럭
		// 1 -> 2 = true -> 3 -> 4 -> 2 = false
		//              -> 다음 실행 흐름
		for(int i =0; i < 3; i++){
			System.out.println("stmt 2");
			System.out.println("stmt 3");
		}
		System.out.println("stmt 4");
	}

}
