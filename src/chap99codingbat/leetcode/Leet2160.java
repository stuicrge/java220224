package chap99codingbat.leetcode;

public class Leet2160 {
	  public int minimumSum(int num) {
	        
	        int n1 = num%10;
	        num=num/10;
	        int n2=num%10;
	        num=num/10;
	        int n3=num%10;
	        num=num/10;
	        int n4 = num%10;
	        
	        int []arr = {n1,n2,n3,n4};
	      //  Arrays.sort(arr);
	        
	        int result = arr[0]*10+arr[1]*10+arr[2]+arr[3];
	        return result;
	        
	        
	    }
}
