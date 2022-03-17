package chap08.lecture.p02polymorphism;

import chap08.lecture.p01interface.example_class.*;

public class App08 {
	//instanceof
	public static void main(String[] args) {
		Retriever dog1 = new Retriever();
		
		Animal animal1 = new Retriever();
		System.out.println(animal1 instanceof Retriever);
		System.out.println(animal1 instanceof Animal);
		System.out.println(animal1 instanceof Canine);
		System.out.println(animal1 instanceof Pet);
		System.out.println(animal1 instanceof Helper);
		
		//강제 형변환 하기전에 instanceof연산자로 가능한지 아닌지 확인해본다
		if(animal1 instanceof Helper) {
			Helper helper = (Helper) animal1;
			helper.help();
		}
	}
}
