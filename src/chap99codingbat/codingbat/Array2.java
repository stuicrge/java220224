package chap99codingbat.codingbat;

public class Array2 {
	
	public int[] shiftLeft(int[] nums) {
		 int []result = new int[nums.length];
		  
		  for(int i=0; i<nums.length; i++){
		    result[i] = nums[(i+1)%nums.length];
		  }
		  return result;
		} 
	
	public int[] fizzArray3(int start, int end) {
		  
		  int []arr1 = new int[end-start];
		  
		  for(int i=start;i<end;i++){
		    arr1[i-start]=i;
		  }
		  
		  return arr1;
		}
	
	
	public int[] fizzArray(int n) {
		  
		  int []arr1;
		  arr1 = new int[n];
		  
		  for(int i=0;i<n;i++){
		    arr1[i]=i;
		  }
		  
		  return arr1;
		}
	
	public int countEvens(int[] nums) {	  
		  int cnt=0;	  
		  for(int i = 0; i<nums.length;i++){
		    if((nums[i]%2)==0){
		      cnt++;
		    }
		  }		  
		  return cnt;
		}
	
	public int centeredAverage(int[] nums) {
		  int max=nums[0];
		  int sum=0;
		  int min=nums[0];
		  
		  for(int i=0; i<nums.length;i++){
		    sum+=nums[i];
		    max=(max<nums[i])? nums[i] : max;
		    min=(min>nums[i])? nums[i] : min;
		  }
		  sum-=max;
		  sum-=min;
		  
		  return sum/(nums.length-2);
		}
	
	public int sum13(int[] nums) {
		int sum = 0;
		boolean is13 = false;
		boolean was13 = false;

		for (int i = 0; i < nums.length; i++) {

			is13 = nums[i] == 13;

			if (!was13 && !is13) {
				sum += nums[i];
			}

			was13 = is13;
		}

		return sum;
	}
	
}
