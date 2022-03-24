package chap13.book.Example.s1304;

import chap13.book.Example.s1302.Box;

public class BoxingMethodExample {
	Box<Integer>box1 = Util.<Integer>boxing(100);
	int intValue = box1.get();
	
	Box<String> box2 = Util.boxing("홍길동");
	String strValue = box2.get();
	
}
