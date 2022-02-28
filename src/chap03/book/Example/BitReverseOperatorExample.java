package chap03.book.Example;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 =10;
		int v2 =~v1;
		int v3 =~v1 + 1;
		System.out.println(toBinaryString(v1)+"(십진수:"+v1+")");
		System.out.println(toBinaryString(v1)+"(십진수:"+v2+")");
	}

	private static String toBinaryString(int value) {
		// TODO Auto-generated method stub
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = "0"+str;
		}
		return str;
	}

}
