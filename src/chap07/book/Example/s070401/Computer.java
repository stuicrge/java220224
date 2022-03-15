package chap07.book.Example.s070401;

public class Computer extends Calculator {
	
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle실행");
		return Math.PI*r*r;
	}
}
