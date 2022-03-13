package chap6.lecture.p03constructor;

public class Computer {
	String cpu;
	String ram;
	String ssd;
	
	//생성자는 여러개 생성가능(=오버로딩)wq
	//그러나 각각생성자는 파라미터의 수와 타입 순서가 달라야한다
	
	Computer(String cpu, String ram, String ssd){
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
	}
	Computer(String cpu, String ram){
		this.cpu = cpu;
		this.ram = ram;
	}
//	Computer(String ram, String ssd){
//		this.ram = ram;
//		this.ssd =ssd;
//	}
	
	
}
