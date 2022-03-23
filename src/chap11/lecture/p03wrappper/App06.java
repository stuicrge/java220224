package chap11.lecture.p03wrappper;

public class App06 {
	public static void main(String[] args) {
		int[] arr=new int[3];
		arr[0]=2;
		
		Integer i1 = new Integer(999);
		arr[1]=i1;
		
		//배열에 double long int 담는 기존의 방법
		double[] arr1 = new double[3];
		arr1[0]=3.14;
		arr1[1]=45176094386L;
		arr1[2]=5463;
		
		//배열에 double,long,int 모두 담길원할때
		Number[] arr2 = new Number[3];
		arr2[0]=3.14;
		arr2[1]=45176094386L;
		arr2[2]=5463;
		
		double d1 = (Double) arr2[0];
		long l1 = (long)arr2[1];
		int i2 = (Integer)arr2[2];
		
		
		
		
		
		
		
		
		
		
		
	}
}
