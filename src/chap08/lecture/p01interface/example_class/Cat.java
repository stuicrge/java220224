package chap08.lecture.p01interface.example_class;

public class Cat extends Feline implements Pet{
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("야옹~");
	}

	@Override
	public void roll() {
		// TODO Auto-generated method stub
		System.out.println("고양이가 무시합니다");
	}
	
	//interface의 default method도 재정의가 가능하다
	@Override
	public void sit() {
		System.out.println("고양이가 도망갑니다.");
	}
}
