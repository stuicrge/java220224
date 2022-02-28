package chap02.lecture;

public class C14TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 99;
		double d1=3.14;
		
		int i2 = (int) (i1+d1);
		double d2 = i1+d1;
		
		int i3 =7;
		int i4 =2;
		
		int i5=i3/i4;
		System.out.println(i5);
		double d3 = i3 / i4;
		System.out.println(d3);
		
		
	}

}
