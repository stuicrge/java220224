package chap6.book.Exercise.exercise19;

public class Accout {
	
	int balance;
	int MIN_BALANCE = 0;
	int MAX_BALANCE = 1000000;
	
	 void setBalance(int balance) {
		 if(balance>=MIN_BALANCE && MAX_BALANCE>=balance) {
			this.balance = balance; 
		 }
	 }
	 int getBalance() {
		 return balance;
	 }
}
