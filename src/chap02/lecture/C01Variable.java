package chap02.lecture;

public class C01Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1;
		//변수명: lowerCamelCase
		//영문대소문자, 숫자, $ , _
		//숫자로 시작핤 없다
		// 자바 예약어 사용못함	
	
	
	//변수에 저장된 값을 다른 명령문에서 사용가능
	//변수에 값 저장(할당, 대입)
	int var2;
	var2 = 3;
	System.out.println(var2);
	
	var2=5;
    System.out.println(var2);
    
    //변수선언 + 값 할당
    int var3 = 10;
    System.out.println(var3);
    
    int var4,var5,var6;
    var4 = 99;
    var5 = 10;
    var6 = 11;
    
    //여러개의 변수선언과 동시에 값 할당이 가능
    int var7 =10 , var8 = 12, var9=20;
    //변수 선언 후 값 할당하지 않고 사용하는것은 빌가능하다/
    
    int var10;
    var10=99;
    System.out.println(var10);
    
    
    
    
    
	}
}
