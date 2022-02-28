package chap04.lecture.ifelse;

public class C04Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = Math.random();
		System.out.println(n1);
		
		
		System.out.println(n1*10);
		double n2 = n1*10;
		System.out.println(n2);
		
		int n3 = (int)n2;
		System.out.println(n3);
		
		int n4 = n3+1;
		System.out.println(n4);
		//1부터 10 사이의 자연수를 얻기위한 
		
		System.out.println("주사위게임");
		System.out.println(((int)(Math.random()*6))+1);
		
		System.out.println("로또");
		System.out.println(((int)(Math.random()*45))+1);
	
	
	}

}
