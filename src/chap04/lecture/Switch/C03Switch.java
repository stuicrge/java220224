package chap04.lecture.Switch;

public class C03Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//default 일치하는 case가 없을 때 실행되는 명령어
		
		switch(3) {
		case 1:
			System.out.println("stmt 1");
			break;
		case 2:
			System.out.println("stmt 2");
			break;
		
		default:
			System.out.println("stmt 3");
			break;
		}
	}

}
