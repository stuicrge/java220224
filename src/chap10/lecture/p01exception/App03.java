package chap10.lecture.p01exception;

public class App03 {
	public static void main(String[] args) {
		//NumberFormalException
		
		String s = "100";
		String t = "3.14";
		
		int i1 = Integer.parseInt(s);
		
		System.out.println(i1+2);
		
		double d1 = Double.parseDouble(t);
		System.out.println(d1*3);
		
		String u = "1 00";
		String v = "3,14";
		
		//Integer.parseInt(u);
		//Double.parseDouble(v);
	}
}
