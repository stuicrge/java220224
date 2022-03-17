package chap08.book.Example.s080205;

public interface RemoteControl {
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
	
}
