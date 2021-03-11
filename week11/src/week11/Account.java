package week11;

public abstract class Account {
	protected String id;
	protected double balance;

	public Account(String id, double balance) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.balance = balance;
	}
	
	public String getID() {
		return id;//get id
	}
	public double getBalance() {
		return balance;//get balance
	}
	@Override
	public String toString() {
		return "ID: " + id + " Balance: " + balance;// return string value
	}

    public abstract boolean withdraw(double amount);//abstract cons
    public abstract void deposit(double amount);//abstact cons

}
