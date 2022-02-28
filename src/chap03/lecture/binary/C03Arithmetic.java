package chap03.lecture.binary;

public class C03Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = 0.1;		
		double d2 = 0.2;
		//r근사치 연산
		double n3 = d1 + d2;
		System.out.println(n3);
		//무한대 연산
		double n4 = 3.14;
		double n5 = 0.0;
		double n6 = n4/n5;
		System.out.println(n6);
		System.out.println(-n6);
		//NAN(Not A Number)
		double n7 = n4 % n5;
		System.out.println(n7);
		
		//정수를 0으로 나눔 -> exception 발생
		int n8 =3;
		int n9 =0;
		
		int n10 = n8 / n9; //exception 발생 후 프로그램 종료
		
		System.out.println("실행을 이어짐");
		
		
	}

}
