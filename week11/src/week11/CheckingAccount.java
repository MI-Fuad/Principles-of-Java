package week11;

public class CheckingAccount extends Account{
	String id;
	double initialBalance;
	private int numberOfChecksUsed = 0;
//	CheckingAccount extends Account. No interest is given by the bank to this type of account.
//	withdrawal and deposit via ATM are charged or electronic transactions are charged with a fee of
//	£1 per transaction. The account balance can’t be less than £0 using ATM or electronic transaction
//	and the minimum amount that can be deposited is also £1. We can assume the deposited amount
//	is always greater or equal to £1.
//	Withdrawal using checks is alway allowed. the first 3 checks use in a month are free of charge,
//	however, any subsequent uses of check are charge a £2 fee for each withdrawal. the balance of a
//	check withdrawal can’t be less than -£10( £10 overdraft).
	public CheckingAccount(String id, double initialBalance) {
		// TODO Auto-generated constructor stub
		super(id, initialBalance);
		this.id = id;
		this.initialBalance = initialBalance;
		
	}
	public boolean withdraw(double amount) {
		if(initialBalance-amount < 0 || initialBalance < 0) {
			return false;//not enough money 
		}else {
			initialBalance -= amount - 1;//charge the £1 and also remove amount
			return true;
		}
	}
	@Override
	public void deposit(double amount) {
		initialBalance += amount;
	}
	public void resetChecksUsed() {
		numberOfChecksUsed = 0;//reset every month 
	}
	public int getChecksUsed() {
		return numberOfChecksUsed;//return no. of checks
	}
    public boolean withdrawUsingCheck(double amount) {
        if (numberOfChecksUsed < 3) {
            if (balance - amount >= -10) {
            		numberOfChecksUsed++;//3 is free
                balance = balance - amount;
                return true;
            } else {
                return false;//you broke
            }
        } else {
            if (balance - amount - 2 >= -10) {
                balance = balance - amount - 2;//rest is charged 
                return true;
            } else {
                return false;//you broke
            }
        }
    }
}
