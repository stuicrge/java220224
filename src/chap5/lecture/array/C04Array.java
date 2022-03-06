package chap5.lecture.array;

public class C04Array {
	public static void main(String[] args) {
		int[][] arr1 = new int[3][];
		System.out.println(arr1.length);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
	
		
		arr1[0] = new int[3];
		System.out.println(arr1[0][0]);
		System.out.println(arr1[0][1]);
		System.out.println(arr1[0][2]);
		
		arr1[1] = new int[3];
		arr1[2] = new int[3];
		
		//3행 4열 행렬과 유사
		int[][]arr2 = new int[3][4];
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		System.out.println(arr2[2].length);
		
		
		System.out.println("3X4 행렬 탐색");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println(arr2[i][j]);
			}
		}
	
	}
}
