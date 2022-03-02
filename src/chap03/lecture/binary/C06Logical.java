package chap03.lecture.binary;

public class C06Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리 연산자
		// && || & | ^ 등등
		// 피연산자: boolean 
		// 연산결과: boolean
		
		System.out.println("AND &&");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("or ||");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//short circuit
		int i =3;
		System.out.println((i>0)&&(i++>0));
		System.out.println(i);
		
		System.out.println((i<0)&&(i++<0));
		System.out.println(i);
		
		System.out.println((i<0)||(i++ < 0));
		System.out.println(i);
				
		System.out.println((i>0)||(i++ > 0));
		System.out.println(i);
		
		System.out.println((i>0)&(i++ > 0));
		System.out.println(i);
		
		System.out.println((i<0)&(i++ < 0));
		System.out.println(i);
		
		// xor
		// 양변이 다를 때만 true , 같으면 false
		System.out.println("^ (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
	
	}
}
