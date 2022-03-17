package chap08.lecture.p01interface.example_class;

public class Retriever extends Canine implements Pet, Helper{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("왈왈!!");
	}

	@Override
	public void help() {
		// TODO Auto-generated method stub
		System.out.println("길 안내를 도와줍니다.");
	}

	@Override
	public void roll() {
		// TODO Auto-generated method stub
		System.out.println("한바퀴 구릅니다.");
	}
	
	
}
