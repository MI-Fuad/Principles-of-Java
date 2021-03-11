package week4;

public class Exercise3{
	public static void main(String[] args) {
		int [] numbers = {1,100, 200, 300, 250, 216, 500,1000,400};
		System.out.println(duplicates(numbers));
	}
// add your code here
	public static boolean duplicates(int[] a) {
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = i+1; j < a.length;j++) {
				//nested loop is used so that the ith index can compare it self with all jth index so 
				//the 0th compares it self with the rest and therefore sees if its equal.
				
				if(a[i] == a[j]) {//this statement checks if the values are equal to each other when the nested loops compares, if so THERE ARE Dups
					
					return true;//make it true when there are dups 
				
				}
			
			}
		
		}
		
		return false;//if not found make it false.
	
	}

}
