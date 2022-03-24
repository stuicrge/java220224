package chap13.book.Example.s1302;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String)box.get();
		box.set(new Apple());
		Apple apple = (Apple)box.get();
		
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(3);
		int value = box2.get();
	}
}
