package Account;

public class accountTest {
	
	public static void main(String [] args) {
		account acc1 = new account("Jack");
		account acc2 = new account("Dave", 99876543);
		account acc3 = new account("Steve", 5.69);
		account acc4 = new account("Steve", 55555555, 71623225.69);

		acc4.setName("Ahmed");
		acc4.setAccountNumber(98746291);
		acc4.setBalance(0.0);
		
		acc3.getAccountNumber();
		acc3.getName();
		acc3.getBalance();
		
		acc4.deposit(200);
		acc4.withdrawl(23.94);
		
		acc4.printAccount();
	}
	
}
