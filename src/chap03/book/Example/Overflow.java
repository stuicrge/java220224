package chap03.book.Example;

public class Overflow {
	public static void main(String[] args) {
		//ㅑint형이 담기엔 너무 큰 수라 쓰레기값이 나온다
		int x = 10000000;
		int y = 10000000;
		int z = x*y;
		System.out.println(z);
		//long형 사용
		long x1 = 100000;
		long y1 = 100000;
		long z1=x1*y1;
		System.out.println(z1);
	}
}
