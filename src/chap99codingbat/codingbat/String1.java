package chap99codingbat.codingbat;

public class String1 {
	public String nTwice(String str, int n) {
	    
	    String a = str.substring(0,n);
	    String b = str.substring(str.length()-n);
	    
	    return a+b;
	}


	public String firstTwo(String str) {
  
		if(str.length()<=2){
			return str;
		}
		else
			return str.substring(0,2);
  
}
	
	
}
