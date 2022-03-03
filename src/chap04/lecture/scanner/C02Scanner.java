package chap04.lecture.scanner;
import java.util.Scanner;

public class C02Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while(run) {
			
			System.out.println("입력>");
			String Line = scanner.nextLine();
			System.out.println("출력>"+Line);
		}
		scanner.close();
		
		
	}
}
