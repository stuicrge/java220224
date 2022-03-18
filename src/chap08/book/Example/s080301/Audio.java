package chap08.book.Example.s080301;

import chap08.book.Example.s080205.RemoteControl;

public class Audio implements RemoteControl{
	private int volume;
	
	public void turnOn() {
		System.out.println("Audio를 키러갑니다");
	}
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("Audio 볼륨: "+ this.volume);
	}
}
