package chap99codingbat.codingbat;

public class Array1 {

	
	public boolean firstLast6(int[] nums) {		  
		return (nums[0]==6) || (nums[nums.length-1]==6);	  		  
	}
	
	public boolean sameFirstLast(int[] nums) {
		 if(nums.length>0){
		 return (nums[0]==nums[nums.length-1]);
		  }
		  else
		  return false;
		}
	
	public boolean commonEnd(int[] a, int[] b) {
		  if((a[0]==b[0])){
		    return true;
		  }else if (a[a.length-1]==b[b.length-1])
		  {
		    return true;
		  }
		  else{
		  return  false;
		  }
		}
	public int sum3(int[] nums) {
		  return nums[0]+nums[1]+nums[2];
		}
	
	
	
}
