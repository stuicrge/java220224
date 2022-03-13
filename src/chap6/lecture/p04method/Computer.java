package chap6.lecture.p04method;

public class Computer {
	
	void execute(String program) {
		System.out.println(program);
	}
	void update(String app) {
		System.out.println(app+"을 업데이트합니다");
	}
	void add(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("합:"+sum);
	}
}
