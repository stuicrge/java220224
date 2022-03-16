package chap07.book.Example.s070502;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed+=10;
		System.out.println("speed: "+speed);
	}
	
	
	//final 키워드 때매 stop메소드는 상속이 불가능하다.
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
