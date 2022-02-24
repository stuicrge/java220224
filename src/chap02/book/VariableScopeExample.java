package chap02.book;

public class VariableScopeExample {

	private static int v2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v1 = 15;
		if(v1>10) {
			int v2 = v1-10;
		}
		int v3 = v1+v2+5;//컴파일 에러
	}

}
