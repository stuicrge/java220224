package chap08.book.Example.s080203;

public interface RemoteControl {
	public int MAX_VOLUME=10;
	public int MIN_VALUE=0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
