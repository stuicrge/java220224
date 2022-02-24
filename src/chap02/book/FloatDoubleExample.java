package chap02.book;

public class FloatDoubleExample {
	public static void main(String[] args) {
		double var1 = 3.14;
		float var2 = 3.14F;
		
		double var3 = 0.123456789;
		float var4 = 0.123456789F;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		int var5 = 3000000;
		double var6 = 3e6;//소숫점위로
		float var7 = 3e6F;
		double var8 = 2e-3;//소숫점아래로
		
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
	}
}
