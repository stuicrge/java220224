package chap04.book.Example;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int m=2; m<=9; m++) {
			System.out.println("***"+m+"단 ***");
			for(int n=1;n<=9;n++) {
				System.out.println(m+"X"+n+"="+(m*n));
			}
		}
		
		
		for(int m=9; m>=2; m--) {
			System.out.println("***"+m+"단 ***");
			for(int n=1;n<=9;n++) {
				System.out.println(m+"X"+n+"="+(m*n));
			}
		}
		
	}

}
