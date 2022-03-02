package chap04.lecture.forloop;

public class C08For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3,1,9,0,7};
		//arr1에 있는 모든 값을 더해서 출력
		int sum =0;
		for(int i=0;i<arr1.length;i++) {
			sum+=arr1[i];
		}
		System.out.println(sum);
		
		int max = arr1[0];
		int min = arr1[0];
		for(int i=0; i<arr1.length;i++) {
			if(max<arr1[i]) {
				max = arr1[i];
			}
			if(min>arr1[i]) {
				min = arr1[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
