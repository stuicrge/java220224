package chap99codingbat.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leet771 {
	class Solution {
	    public int numJewelsInStones(String jewels, String stones) {

	    int result=0;
	    for(int i=0;i<jewels.length();i++){
	        for(int j=0;j<stones.length();j++){
	        if(jewels.charAt(i)==stones.charAt(j))
	        {
	            result++;
	        }
	            
	        }
	            
	    }        
	     return result;   
	    }
	    
	    
//	    //방법 2 framework사용
//	     Set<Character> set = new HashSet<>();
//	        
//	        for(char c1 : jewels.charArray()){
//	            set.add(c1);
//	            
//	        }
//	        int cnt = 0;
//	        
//	        for(char c : stones.toCharArray()){
//	            if(set.contains(c1)){
//	                cnt++;
//	            }
//	        }
	     
	}
}
