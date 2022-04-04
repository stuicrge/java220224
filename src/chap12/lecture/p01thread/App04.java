package chap12.lecture.p01thread;

public class App04 {
	public static void main(String[] args) {
		//sleep : 현재 쓰레드 실행을 millisecond 만큼 멈춤
		System.out.println("쓰레드 실행중");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("쓰레드 실행 계속");
	}
}
