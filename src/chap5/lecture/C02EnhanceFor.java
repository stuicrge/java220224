package chap5.lecture;

public class C02EnhanceFor {
	public static void main(String[] args) {
		int[] arr = {-1,2,10,13};
		
		int sum=0;
		
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
		
		for(int e : arr) {
			sum += e;
		}
		
		System.out.println(sum);
	}
}
