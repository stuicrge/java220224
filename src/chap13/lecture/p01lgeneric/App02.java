package chap13.lecture.p01lgeneric;

public class App02 {
	public static void main(String[] args) {
		Container2 con1 = new Container2();
		con1.setContent("java");
		String str = (String) con1.getContent();
		
		Container2 con2 = new Container2();
		con2.setContent(1);
		Object o1 = con2.getContent();
		Integer i1 = (Integer) o1;
	}
}
class Container2 {
	private Object content;
	public void setContent(Object content) {
		this.content=content;
	}
	public Object getContent() {
		return content;
	}
}
