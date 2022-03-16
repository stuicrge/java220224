package chap99codingbat.leetcode;

public class Leet344 {
	class Solution {
	    public void reverseString(char[] s) {
	    
	        int left = 0;
	        int right = s.length-1;
	        
	        while(left < right){
	            swap(s,left,right);
	            
	            left++;
	            right--;
	        }

	    }

	private void swap(char []s,int left,int right){
	    char tmp = s[left];
	    s[left] = s[right];
	    s[right] =tmp;
	} 
	}
}
