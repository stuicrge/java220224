package chap6.book.Exercise.exercise19;

public class AccoutExample {
	public static void main(String[] args) {
		Accout account = new Accout();
		
		account.setBalance(10000);
		System.out.println(account.getBalance());
		
		account.setBalance(-100);
		System.out.println(account.getBalance());
		
		account.setBalance(20000);
		System.out.println(account.getBalance());
		
		account.setBalance(300000);
		System.out.println(account.getBalance());
	}
}
