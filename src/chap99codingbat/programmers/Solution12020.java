package chap99codingbat.programmers;

public class Solution12020 {
	  public String solution(String phone_number) {
	        String answer = "";
	            for(int i=0;i<phone_number.length()-4;i++){
	                answer+="*";

	            }
	        answer += phone_number.substring(phone_number.length()-4);
	        return answer;
	    }
}
