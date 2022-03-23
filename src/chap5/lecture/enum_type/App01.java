package chap5.lecture.enum_type;

public class App01 {
	private static final int SPRING = 0;
	private static final int SUMMER = 1;
	private static final int FALL =2;
	private static final int WINTER =3;
	
	public static void main(String[] args) {
		
		//정해진 값(상수  constant values)를 사용
		
		int season = SPRING;
		switch(season) {
		
		case SPRING:
			System.out.println("봄");
			break;
		case SUMMER:
			System.out.println("여름");
			break;
		case FALL:
			System.out.println("가을");
			break;
		case WINTER:
			System.out.println("겨울");
			break;
		}
		
		
	}
}
