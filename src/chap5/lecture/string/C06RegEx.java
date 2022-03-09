package chap5.lecture.string;

public class C06RegEx {
	public static void main(String[] args) {
		// regular expression
		// 정규식(정규표현식)
		// 문자열의 패턴을 표현한 문자
		//^ : 문자를 제외한다
		
		//한문자
		System.out.println("a".matches("a"));
		System.out.println("b".matches("a"));
		System.out.println("aa".matches("a"));
		System.out.println("abc".matches("a"));
		
		//여러문자중 하나
		System.out.println("a".matches("[abc]"));
		System.out.println("b".matches("[abc]"));
		System.out.println("c".matches("[abc]"));
		System.out.println("d".matches("[abc]"));
		
		System.out.println("abc".matches("[abc][abc][abc]"));
		System.out.println("bbb".matches("[abc][abc][abc]"));
		
//		String pattern1 = "010-\\d{4}-\\d{4}";
		String pattern1 = "010-\\d{3,4}-\\d{4}";
		System.out.println("010-9874-1234".matches(pattern1));
		
		//
		String pattern2 = "[hd]";
		System.out.println("h".matches(pattern2));
		System.out.println(",".matches(pattern2));
		System.out.println("d".matches(pattern2));
		
	}
}
