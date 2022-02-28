package chap02.book;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780;
		
//float num3 = num2; float이 int보다 작아서 원하는 값이 안나옴
		double num3 = num2;
		num2 = (int)num3;
		
		int result = num1-num2;
		System.out.println(result);
				
	}

}
