package chap02.lecture;

public class C11TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 2_100_000_000;
		double d1 = 2_100_000_000.12345;
		
		int i2;
		double d2;
		//자동 형변환
		i2 =i1;
		d2 = i1;
		//실수 -> 정수 : 강제형변환
		i2 = (int)d1;
		d2 = d1;
		
		System.out.println(d2);
		System.out.println(i2);
	}

}
