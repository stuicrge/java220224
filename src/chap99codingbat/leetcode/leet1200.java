package chap99codingbat.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet1200 {
	 public List<List<Integer>> minimumAbsDifference(int[] arr) {
	        
	        Arrays.sort(arr);
	        
	        
	        
	        int mindiff = Integer.MAX_VALUE;
	        for(int i=0;i<arr.length-1;i++){
	            
	            int diff = arr[i+1]-arr[i];
	            mindiff = Math.min(mindiff,diff);
	            
	        }
	        
	     List<List<Integer>> res = new ArrayList<>();
	        
	    for(int i=0;i<arr.length-1;i++){
	        int diff = arr[i+1] - arr[i];
	        if(mindiff==diff){
	            res.add(Arrays.asList(arr[i],arr[i+1]));
	        }
	    }
	        return res;
	    }
}
