package chap10.lecture.p03checked;

public class App04 {
	public static void main(String[] args) {
		
		try {
		Class.forName("");
	} catch(ClassNotFoundException e) {
		System.out.println("클래스낫파운드익셉션 진행");
	}
}
}