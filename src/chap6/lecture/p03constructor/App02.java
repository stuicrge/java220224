package chap6.lecture.p03constructor;

public class App02 {
	public static void main(String[] args) {
		Desk d1 =new Desk();
		System.out.println(d1.weight);
		System.out.println(d1.color);
	
		Desk d3 = new Desk(2000,"red");
		System.out.println(d3.weight);
		System.out.println(d3.color);
	
	}
}
