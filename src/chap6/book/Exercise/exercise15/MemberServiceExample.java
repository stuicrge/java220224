package chap6.book.Exercise.exercise15;

public class MemberServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService memberservice = new MemberService();
		boolean result = memberservice.login("hong","12345");
		if(result) {
			System.out.println("로그인되었습니다");
			memberservice.logout("hong");
		}else {
			System.out.println("id 또는 password가 옳지않습니다");
		}
	}

}
