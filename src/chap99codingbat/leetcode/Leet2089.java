package chap99codingbat.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet2089 {
	class Solution {
	    public List<Integer> targetIndices(int[] nums, int target) {
	        
	        Arrays.sort(nums);
	        List<Integer>list = new ArrayList<>();
	        
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==target){
	                list.add(i);
	            }
	            if(nums[i]>target){
	             break;   
	            }
	        }
	        return list;
	    }
	}
}
