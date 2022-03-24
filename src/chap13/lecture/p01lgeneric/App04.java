package chap13.lecture.p01lgeneric;

import chap07.lecture.p99polymorphism_class.*;

public class App04 {
	Container4<String> o1 = new Container4<String>();
	Container4<Integer> o2 = new Container4<Integer>();
	Container4<Animal> o3 = new Container4<Animal>();
	//8개의 기본타입은 <>안에 들어갈 수 없다 = 타입 파라미터로 사용불가
	//8개의 wrapper class 이용
	Container4<Chihuahua> o4 = new Container4<>(); // 셍략가능
}
class Container4<T>{
	public void method(T parma) {
		
	}
}