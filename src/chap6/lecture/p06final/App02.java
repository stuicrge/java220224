package chap6.lecture.p06final;

public class App02 {
	
	int i=3;
	final int j=5;
	final int k;
	
	App02()
	{
		k=30;
	}
	
	
	public static void main(String[] args) {
		App02 a1 = new App02();
		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println(a1.k);
	}
}
