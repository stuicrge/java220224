package chap04.book.Example;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		if(score>=90) {
			System.out.println("점수는 100에서 90사이");
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("점수는 89에서 80사이");
			System.out.println("B");
		}else if (score>=70) {
			System.out.println("점수는 79에서 70사이");
			System.out.println("C");
		}else {
			System.out.println("점수는 70미만입니다");
			System.out.println("D");
		}
	}
}
