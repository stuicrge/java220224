package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Chihuahua;

public class App08 {

	public static void main(String[] args) {
		Animal animal1 = new Chihuahua();
		animal1.breathe();
		animal1.cry();
		
		Chihuahua chihuahua = (Chihuahua) animal1;
		chihuahua.angry();
	}
	
	
}
