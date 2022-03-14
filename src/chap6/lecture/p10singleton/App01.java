package chap6.lecture.p10singleton;

public class App01 {
	public static void main(String[] args) {
		Manager m1 = Manager.getInstance();
		Manager m2 = Manager.getInstance();
		//Manager m2 = new Manager();
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}
}
