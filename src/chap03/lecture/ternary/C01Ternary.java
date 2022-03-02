package chap03.lecture.ternary;

public class C01Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼항연산자
		// 일 ? 이 : 삼
		// 연산결과는 일이 true이면 이
		// 일이 false이면 삼
		
		int i = true ? 1 :2 ;
		System.out.println(i);
		
		int i2 = false ? 1 : 2;
		System.out.println(i2);
		
		System.out.println(true ? "가" : "나");
		System.out.println(false ? "다" : "라");
		
		int k =3;
		System.out.println((k != 3)?"마":"바");
	}
}
