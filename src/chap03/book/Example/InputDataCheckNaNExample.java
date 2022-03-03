package chap03.book.Example;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		if(Double.isNaN(val)) {
			System.out.println("nan이 입력되어 처리할수 없음");
			val = 0.0;
			
		}
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
