package week4;

public class Exercise1{
	public static void main(String[] args) {
		String [] stringArray = {"computing", "at ","Goldsmiths", "College", "University", "of", "London", "New Cross", "London","SE14 6NW"};
		System.out.println(longestStringInArray(stringArray)); // this should print university.
	
	}
	public static String longestStringInArray(String [] a){
	// add your code here
		String space = " ";
	
		for(int i = 0; i < a.length;i++) {

			if(a[i].length()>=space.length()) {
				
				space = a[i];	
			
			}
		}
		
		return space;
	
	}
}