package chap08.book.Example.s080505;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스 출발합니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
