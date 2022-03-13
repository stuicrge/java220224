package chap6.lecture.p03constructor;

public class App4 {
	public static void main(String[] args) {
		Star star1 = new Star(3);
		System.out.println(star1.stars);
		
		Star star2 = new Star(10);
		System.out.println(star2.stars);
		
		Star star3 = new Star("#",10);
		System.out.println(star3.stars);
	}
}
