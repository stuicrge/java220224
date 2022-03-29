package chap15.lecture.p02set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class App03 {
	
	@Test
	public void test() {
		assertTrue(solution(new int[] {1,2,3,3,4,5}));
		assertFalse(solution(new int[] {99,88,77,66,55}));
		assertFalse(solution(new int[] {}));
		assertTrue(solution(new int[] {1,1}));
		
	}
	public boolean solution(int[]nums) {
		
		Set<Integer> set = new HashSet<>(); 
		
		for(int num: nums) {
			set.add(num);
		}
		
		
//		Iterator<Integer> iter = set.iterator();
//		while(nums.length != set.size()) {
//			return iter.hasNext();
//		}
		return nums.length != set.size();
	}
}
