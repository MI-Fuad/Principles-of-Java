package week11;

public class SavingAccount extends Account{
	String id;
	double initialDeposit;
	public SavingAccount(String id, double initialDeposit) {
		// TODO Auto-generated constructor stub
		//initialise all the variables 
		super(id, initialDeposit);
		this.id = id;
		this.initialDeposit = initialDeposit;
		
	}
	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance-amount-3 >= 10) {
			balance = balance - amount - 3;//charge the £3 and also remove amount
			return true;
		}else {
			return false;//you broke
		}
	}
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		//add the amount to the balance 
		balance += amount;
	}
	public double addInterest(double rate) {
        double interest = balance * (rate / 100);//intrest rate is % so/ 100
        balance += interest;//add to balance 
        return interest;
	}

}
