package chap03.lecture.unary;

public class C02Increment {
	public static void main(String[] args) {
		//증감연산자
		//++ , --
		
		int i =7;
		i++; // i=i+1;
		
		System.out.println(i);
		
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		//증감연산자 위치 : 피연산자 앞/뒤

		++i; 
		System.out.println(i);
		--i;
		System.out.println(i);
		
		
		System.out.println(i++);
		System.out.println(i);
		
		System.out.println(i--);
		System.out.println(i);
		
		System.out.println(++i);
		System.out.println(i);
		
		System.out.println(--i);
		System.out.println(i);
	
	}
}
