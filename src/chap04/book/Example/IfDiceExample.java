package chap04.book.Example;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;//주사위공식
		if(num==1) {
			System.out.println("1이 나옴");
		}else if(num==2) {
			System.out.println("2가 나옴");
		}else if(num==3) {
			System.out.println("3이 나옴");
		}else if(num==4) {
			System.out.println("4가 나옴");
		}else if(num==5) {
			System.out.println("5가 나옴");
		}else
		{
			System.out.println("6이 나옴");
		}
	}
}
