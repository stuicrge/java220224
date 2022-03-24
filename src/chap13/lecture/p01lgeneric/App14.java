package chap13.lecture.p01lgeneric;

public class App14 {
	//method에 type parameter 추가
	// generic method
	public static void main(String[] args) {
		App14.<String>method("java");
		method("java");
		
		String s1 = App14.<String>method2();
		String s2 = method2();
		
		String s3 = App14.<String>method3("java");
		String s4 = method3("java");
	}
	public static <T> void method(T param) {
		
	}

	public static <T> T method2() {
		return null;
	}
	public static <T> T method3(T param) {
		return null;
	}
}

