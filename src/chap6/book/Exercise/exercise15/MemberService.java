package chap6.book.Exercise.exercise15;

public class MemberService {
	String id;
	String password;
	
	
	void logout(String id) {
		System.out.println("로그아웃되었습니다");
	}
	
	boolean login(String id, String password) {
		if(id=="hong" && password=="12345") {
			return true;
		}
		else {
			return false;
		}
	}
}
