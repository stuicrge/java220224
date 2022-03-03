package chap04.book.exercise;

import java.util.Scanner;

public class exercise7 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.println("선택>");
			
			int choice = scanner.nextInt();
			int saving = 0;
			int paying = 0;
			
			
			if(choice == 1) {
				System.out.print("예금액>");
				saving = scanner.nextInt();
				balance+=saving;
				
				//continue;
			}
			else if(choice == 2) {
				System.out.println("출금액>");
				paying = scanner.nextInt();
				balance-=paying;
				//continue;
			}
			else if (choice == 3) {
				System.out.print("잔고>");
				System.out.print(balance);
				//continue;
			}
			else if(choice == 4) {
				break;
			}
						
		}
		System.out.println("프로그램 종료");
	}
}
