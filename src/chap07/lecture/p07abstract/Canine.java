package chap07.lecture.p07abstract;

public abstract class Canine {
	
	//본문이 없는 메소드는 추상메소드
	//abstract 키워드를 꼭 작성해야한다
	public abstract void play(); //{
		//System.out.println("개과랑 놉니다.");
	//}
	public void bark() {
		System.out.println("멍멍");
	}
}
