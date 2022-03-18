package chap09.book.Exercise.exercise04;

public class NestedExample {
	public static void main(String[] args) {
		Car mycar = new Car();
		
		Car.Tire tire = mycar.new Tire();
		Car.Engine engine = new Car.Engine();
	}
}
