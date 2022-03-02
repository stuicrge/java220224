package chap04.book.exercise;

public class exercise3 {
	public static void main(String[] args) {
		int sum3 = 0;
		
		for(int i=1; i<=100; i+=3) {
			
			sum3+=i-1;
		}
		System.out.println("3의배수의 총합:"+sum3);
	}
}
