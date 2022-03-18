package chap08.book.Example.s080402;

import chap08.book.Example.s080205.RemoteControl;

public class Audio implements RemoteControl{
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 킵니다");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: "+this.volume);
	}
	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		this.mute = mute;
		if(mute) {
			System.out.println("Audio를 무음처리합니다");
		}else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
