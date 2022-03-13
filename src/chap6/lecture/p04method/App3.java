package chap6.lecture.p04method;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1 = new Computer();
		c1.execute("game");
		c1.execute("excel");
		
		c1.update("calculator");
		
		c1.add(3, 5);
		c1.add(10, 20);
		c1.add('c', 'a');
	}

}
