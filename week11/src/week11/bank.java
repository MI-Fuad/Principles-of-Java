package week11;
import java.util.ArrayList;


public class bank {
	
    private final ArrayList<Account> accounts;
    
    private double savingsInterestRate;
	
	public bank() {
		// TODO Auto-generated constructor stub
        accounts = new ArrayList<Account>();//new array that holds all the accounts
	}
	public void setSavingsInterest(double rate) {
		//set the intrestrate to the parameter
        this.savingsInterestRate = rate;
	}
	public int numberOfAccounts() {
		//get the length of the array list which therefore shows how many accounts
		return accounts.size();
	}
	public void addAccount(Account a) {
		//add an account to the array list which adds and account
		accounts.add(a);
	}
	public Account getAccount(String accountID) {
		for(Account account : accounts) {//check all indexes of the for loop 
			if(account.getID().equals(accountID)) {//until the parameter is equal to the index
				return account;//return that account
			}
		}
		return null;
	}
	public boolean deposit(String accountID, double amount) {
		Account account = getAccount(accountID);
		if(accountID != null) {//check if account id is true or false
			account.deposit(amount);//then deposit
			return true;
		}else {
			return false;
		}
	}
	public boolean withdraw(String accountID, double  amount) {
		Account account = getAccount(accountID);
		if(accountID != null) {//again check if the account id is true or false
			account.withdraw(amount);//withdraw to that account with amount
			return true;
		}else {
			return false;
		}
	}
	public boolean transfer(String fromAccountID, String toAccountID, double amount) {
		Account fromAccount = getAccount(fromAccountID);//get the sender
		Account toAccount = getAccount(toAccountID);//get the receiver
		if(fromAccount != null && toAccount != null) {//check if the accounts exisit
			if(fromAccount.withdraw(amount)) {//then withdraw the amount from sender
				toAccount.deposit(amount);//and deposit to the receiver
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	public void addInterest() {
		for (Account account : accounts) {
			if (account instanceof SavingAccount) {
				SavingAccount savingAccount = (SavingAccount) account;
				savingAccount.addInterest(savingsInterestRate);
				}
			}
		}

	public void reset() {
		for (Account account : accounts) {
			if (account instanceof CheckingAccount) {
				CheckingAccount checkingAccount = (CheckingAccount) account;
				checkingAccount.resetChecksUsed();
	           }
	       }
	   } 
}
