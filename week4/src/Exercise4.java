package week4;

public class Exercise4 {
	public static void main(String[] args) {
		primeNumbers(100);
	}
	
	public static int primeNumbers(int n) {
//		boolean isPrime = false;
		int no = 0;
		
		for(int i = 1; i <= n; i++) {
			
			int counter = 0;
			
			for(no = i; no >= 1; no--) {
				//nested loop so it can get the i'th value and compare it with every n'th value so 1 divided all  no. up to a 
				//100 so it can therefor compare all numbers. all even numbers will make the counter +1 and if the counte
				//gets to 2 it means the number can therefore be even or divisable by more than 1 and it itself so NOT prime.
				
				if(i % no == 0) {//if the remainder is 0 it therefore means it can devide so add one to the counter and move on.
					
					counter++;//counter + ! 
				
				}
			
			}
			
			if(counter == 2) {
			
				System.out.println(i);//when counter is 2 the nth and ith can not be divsable so therfore it is prime as it can divide by it self and 1 only.
			
			}
		
		}
		
		return 0;
	
	}
}