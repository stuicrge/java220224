package chap13.book.Exercise;

public class exercise02 {
	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
	}
}

class Container<T>{
	private T content;
	
	public T get(){
		return content;
	}
	public void set(T content) {
		this.content = content;
	}
}
