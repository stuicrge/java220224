package chap04.lecture.Switch;

public class C04Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		switch(3) {
		case 1:
			System.out.println("stmt 1");
			break;
		case 2:
			System.out.println("stmt 2");
			break;
		default://스위치에 일치하는 case가 없을때
		    System.out.println("stmt 3");
			break;
		
		}
		String s = "hello";
		switch(s) {
		
		
		
		}
	}
}
