package chap15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class App02 {
	public static void main(String[] args) {
		Set<Integer> Lotto = new HashSet<>();
		while(Lotto.size()<6) {
		Lotto.add((int) (Math.random()*45)+1);
		
		}		
			System.out.println(Lotto.size());
			System.out.println(Lotto);
		
		
	}
}
