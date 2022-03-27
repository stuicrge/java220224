package chap14.book.Exercise.exercise05;

import java.util.function.IntBinaryOperator;

public class LamdaExample {
	
	private static int[] scores = {10,50,3};
	
	public static int maxOfMin(IntBinaryOperator operator) {
		
		int result=scores[0];
		for(int score:scores) {
			result=operator.applyAsInt(result, score);
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		int max = maxOfMin((a,b)->
			Math.max(a,b));
		System.out.println("최대값: "+max);
		
		int min = maxOfMin((a,b)->Math.min(a,b));
	}
	
	
}
