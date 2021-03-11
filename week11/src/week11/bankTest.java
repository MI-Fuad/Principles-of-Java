package week11;

public class bankTest {

	   public static void main(String[] args) {
		   CheckingAccount sam = new CheckingAccount("12",3000);
		   bank acc = new bank();
		   acc.addAccount(sam);
		   
		   System.out.println(sam.toString());
		   System.out.println(sam.getChecksUsed());
		   System.out.println(acc.numberOfAccounts());
	   }

}
