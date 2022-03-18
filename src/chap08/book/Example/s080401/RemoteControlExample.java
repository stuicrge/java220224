package chap08.book.Example.s080401;


import chap08.book.Example.s080205.RemoteControl;
import chap08.book.Example.s080301.Audio;
import chap08.book.Example.s080301.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc=null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
}
