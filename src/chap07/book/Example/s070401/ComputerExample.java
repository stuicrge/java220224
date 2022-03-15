package chap07.book.Example.s070401;

public class ComputerExample {
	public static void main(String[] args) {
		int r=10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적: "+calculator.areaCircle(r));
		System.out.println();
		
		Computer c1 = new Computer();
		System.out.println("원면적: "+c1.areaCircle(r));
	}
}	
