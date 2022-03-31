package chap99codingbat.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leet287 {
	public int findDuplicate(int[] nums) {
	     
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(!set.add(num)){
                return num;
            }
        }      
        return 0;
    }
}
