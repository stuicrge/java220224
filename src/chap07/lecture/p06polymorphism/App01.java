package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App01 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		chihuahua.breathe();
		StreetCat streetcat = new StreetCat();
		streetcat.breathe();
		
		chihuahua.cry();
		streetcat.cry();
	}
}
