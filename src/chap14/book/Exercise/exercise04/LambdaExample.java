package chap14.book.Exercise.exercise04;

import java.util.function.IntSupplier;

public class LambdaExample {
	
		
		public static int method(int x,int y) {
			IntSupplier supplier = () ->{
			//	x*=10; //final변수 x를 연산해서 바꾸려함
				int result = x+y;
				return result;
			};
			int result = supplier.getAsInt();
			return result;
		}
		
		public static void main(String[] args) {
			System.out.println(method(3,5));
		}
	
}
