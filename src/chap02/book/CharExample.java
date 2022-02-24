package chap02.book;

public class CharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char var1 = 'A';
		char var2 = 65;
		char var3 = '\u0041';
		
		char var4 = '가';
		char var5 = 44032;
		char var6 = '\uac00';
		
		int uniCode = var1;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(uniCode);
		
	}

}
