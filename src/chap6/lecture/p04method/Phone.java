package chap6.lecture.p04method;

public class Phone {
	//같은 이름의 메소드를 여러개만듬(method overloading)
	//같은메소드여도
	//파라미터의 타입 개수 순서로 구분함
	
	
	
	void call(String name) {
		System.out.println(name+"에게전화함");
	}

	void call(int number) {
		System.out.println(number+"로 전화검");
	}
	void call(String name, int number) {
		
	}
	void call(int number, String name) {
		
	}

}
