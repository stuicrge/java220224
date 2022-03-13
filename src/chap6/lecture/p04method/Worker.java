package chap6.lecture.p04method;

public class Worker {
	String name;
	
	Worker(String name){
		this.name = name;
	}
	
	void work() {
		System.out.println(name+"이 일합니다");
	}
	
}
