package chap99codingbat.leetcode;

import java.util.Arrays;

public class Leet1816 {
	
	    public String truncateSentence(String s, int k) {
	        
	        String[] arr = s.split(" ");
	        
	        String[] res = Arrays.copyOf(arr,k);
	        
	        
	        String str = String.join(" ",res);
	        return str;
	    }
	
}
