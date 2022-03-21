package chap10.lecture.p02try;

public class App05 {
	
	public static void main(String[] args) {
		
		int []arr1 = new int[] {3,0};
		
		try {
			int r = arr1[0]/arr1[1];
			
			System.out.println(r);
			
		}catch(NullPointerException e){
			System.out.println("널포인터 익셉션 발생");
		}catch(ArithmeticException e){
			System.out.println("아리스메틱익셉션 발생");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("어레이 인덱스아웃오브바운즈엑셉션 발생");
		}catch(RuntimeException e) {
			
		}
		
		//catch 블럭 여러개 작성시
		//하위타입보다 상위타입을 아래에 작성
		System.out.println("프로그램 실행 계속");
	}
}
