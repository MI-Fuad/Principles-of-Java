package Account;

public class account {

	String name;
	int accountNumber;
	Double Balance;
	
	
	account(String s){
		this.name = s;
		this.accountNumber = 0;
		this.Balance = null;
		
	}
	account(String s, int n){
		this.name = s;
		this.accountNumber = n;
		this.Balance = null;
		
	}
	account(String s, double b){
		this.name = s;
		this.Balance = b;
		this.accountNumber = 0;
		
	}
	account(String s, int n, double b){
		this.name = s;
		this.accountNumber = n;
		this.Balance = b;
	}
	
	void setName(String name){
		this.name = name;
	}
	void setAccountNumber(int accountNumber){
		
		this.accountNumber = accountNumber;
	}
	void setBalance(double Balance){
		this.Balance = Balance;
	}
	
	String getName(){
		return name;
	}
	int getAccountNumber(){
		return accountNumber;
	}
	double getBalance(){
		return Balance;
	}
	
	public double deposit(double d) {
		this.Balance = this.Balance + d;
		return this.Balance;
	}
	
	
	public double withdrawl(double w) {
		if(this.Balance >= w) {
			this.Balance -= w;
		} else {
			System.out.println("Insufficient Funds");
		}
		return this.Balance; 
	}
	
	
	public String toString() {
		return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: £" + Balance; 
	}
	
		void printAccount() {
			System.out.println(toString());
		}
	
	
}
