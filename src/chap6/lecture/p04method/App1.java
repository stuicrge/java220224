package chap6.lecture.p04method;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("winter");
		Student s2 = new Student("spring");
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		
		s1.study();
		s2.study();
	}
}
