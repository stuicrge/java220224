package chap99codingbat.leetcode;

public class Leet1512 {
	class Solution {
	    public int numIdenticalPairs(int[] nums) {
	        int result = 0;
	        
	        for(int i=0;i<nums.length-1;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]==nums[j]){
	                    result++;
	                }
	            }
	        }
	        return result;
	    }
	}
}