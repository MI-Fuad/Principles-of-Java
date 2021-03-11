package week4;

public class Exercise2{
	public static void main(String[] args) {
		int [] numbers = {1,100, 200, 300, 250, 216, 500,1000,400};
		//int [] numbers = {0,2, 3, 4, 5, 6, 7,8,9};
		System.out.println(isSorted(numbers));
	}
	
	public static boolean isSorted(int [] a){
		// add your code here
		boolean sorted = true;
		
		for(int i = 1; i < a.length; i++) {
			//System.out.println(a[i-1] + " " + a[i]);
			
			if(a[i-1]>a[i]) {//compare the number with it self -1 as this will check if the numebrs are sorted as the number one less should be in order as a number 
					//as a number 1 BELOW SHOULD NOT be more than it should be LESS THAN! hence return false
				
					sorted = false;//when found
		
			}
		
		}
	
		return sorted;

	}

}