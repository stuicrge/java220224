package chap08.book.Example.s080303;

import java.rmi.Remote;

import chap08.book.Example.s080205.RemoteControl;

public class SearchTelevision implements RemoteControl,Searchable{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else
		{
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: "+this.volume);
	}
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}
	
	
}
