package chap6.book.example.s060602;

public class CarExample {
	public static void main(String[] args) {
		//객체생성
		Car myCar = new Car();
		
		System.out.println("제작회사: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("최고속도: "+myCar.maxSpeed);
		System.out.println("현재속도: "+myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("바뀐 속도: "+myCar.speed);
	}
}
