package chap07.lecture.p02override;

public class QuantumComputer extends Computer {
	
	
	//상속받은 메소드가 맘에 들지 않아 재정의
	// method override
	// 하위 클래스에서 재정의하는것
	public void execute() {
		System.out.println("더 빠른 연산을 합니다");
	}
	
	
	public void otherExecute() {
		System.out.println("다른 연산을 합니다");
	}
	
}
