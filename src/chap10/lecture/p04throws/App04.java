package chap10.lecture.p04throws;

public class App04 {
	public static void main(String[] args) {
		try {
		Class.forName("");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
