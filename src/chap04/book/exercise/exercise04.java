package chap04.book.exercise;

public class exercise04 {
	public static void main(String[] args) {
		int sum=0;
		
		int d1 = 0;
		int d2 = 0;

		boolean more = true;
		while (more) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			
			System.out.println("(" + num1 + ", " + num2 + ")");
			
			while ((num1 + num2) == 5) {
				more = false;
			}
		}
		
//		while(true) {		
//		 d1 = (int)(Math.random()*6)+1;
//		 d2 =(int)(Math.random()*6)+1;
//		 System.out.println("("+d1+","+d2+")");	
//		 sum=d1+d2;
//			
//			if(sum==5) {
//				break;
//			}
//		}
	}	
}
