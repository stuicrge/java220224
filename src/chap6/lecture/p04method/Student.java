package chap6.lecture.p04method;

public class Student {
	String name;
	
	Student(String name){
		this.name = name;
	}
	
	//instance method: 이 클래스에 의해 만들어지는 인스턴스(객체)의 기능(행동,action)
	// 리턴타입 메소드명(파라미터타임 파라미터명...){명령문}
	
	void study(){
		System.out.println("공부합니다");
	}
	
}
