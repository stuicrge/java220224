package chap02.lecture;

public class C10TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1 = 9000.1234F;
		double d1 = 120000.1234;
		
		System.out.println(f1);
		System.out.println(d1);
		
		
		float f2;
		double d2;
			
		f2 = f1;
		d2 = f1;
		//f2에 d2를 넣고 싶다면
		f2 = (float)d1;
		d2 = d1;
		System.out.println(f2);
		System.out.println(d2);
		
	}

}
