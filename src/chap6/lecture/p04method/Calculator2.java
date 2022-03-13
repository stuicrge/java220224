package chap6.lecture.p04method;

public class Calculator2 {
	//varargs (가변길이 매개변수)
	int sum(int... nums) {
		System.out.println(nums.length);
		
		int sum=0;
		
		for(int num: nums ) {
			sum+=num;
		}
		
		return sum;
	}
	
 public void concat(String...strings) {
				
		for(String str: strings) {
		System.out.println(str);
	}		
	
	}
	
}
