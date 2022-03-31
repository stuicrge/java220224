package chap99codingbat.leetcode;

import java.util.*;

public class Leet1684 {
	   public int countConsistentStrings(String allowed, String[] words) {
	        
	        Set<Character> set = new HashSet<>();
	        int cnt=0;
	        
	        
	        for(char c : allowed.toCharArray()){
	            set.add(c);
	        }
	        
	    
	        for(String word : words){ 
	            if(consistent(set,word)){       
	                cnt++;
	            }
	            
	        }  
	        
	        return cnt;
	    }
	    
	    private boolean consistent(Set<Character>set, String word){
	        for(char c : word.toCharArray()){
	            if(!set.contains(c)){
	                return false;
	            }
	        }
	        return true;
	    }
	
	
}
