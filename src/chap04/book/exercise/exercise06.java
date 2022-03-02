package chap04.book.exercise;

public class exercise06 {
	public static void main(String[] args) {
		String star ="*";
		for(int i=0;i<5;i++) {
			System.out.println(star);
			star+="*";
		}
		System.out.println("출력(끝에 enter없이)");
		
		System.out.print("출력1");
		System.out.print("출력2");
		System.out.println();
		System.out.print("출력3");
		System.out.println("출력4");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<(i+1); j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
	}
}
