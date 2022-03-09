package chap5.lecture.string;

public class C05String {
	
	public static void main(String[] args) {
		
		String s1 = "java12345script";
		String s2 = s1.replaceAll("a","z");
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = s1.replaceAll("[0~9]","*");
		System.out.println(s3);
		//String s4 = s1.replaceAll("[a~z", replacement)
	}
	
	
}
