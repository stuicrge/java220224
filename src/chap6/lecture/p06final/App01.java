package chap6.lecture.p06final;

public class App01 {
	public static void main(String[] args) {
	//final: 변수 선언시 작성하면 값을 한번만 할당 가능
		
	int i=0;
	i=3;
	final int j=0;
	//j=1     //xx
	
	final int k;
	k=9;      //oo
  	//k=10;     //x
	method1(3);
	method1(10);
	}
	
	public static void method1(final int i) {
		//i=30; //XX
	}
}
