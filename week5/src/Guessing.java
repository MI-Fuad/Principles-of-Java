package week5;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Guessing {

    public static void main(String[] args) throws IOException {
    	
    		binarySearchGuess(1,1000);
    
    }
    
    public static void binarySearchGuess(int lower, int upper) {//define lower and upper bounds
		Scanner userInput = new Scanner(System.in);
		Random rand = new Random();
		int randomer = 0;//random number between lower and upper bound
		int counter = 0;
		String ansOut = "";//emtpy string for the user output to be stored
	
		do {
			randomer = (upper + lower + 1) / 2;
			System.out.println("My guess is:  " + '"' + randomer + '"' + "  Is this correct? If so, press 'c' if not, press 'h' for your number is high or 'l' is lower!");
			ansOut = userInput.nextLine();
			if(counter >= 9) {
				System.out.println("You have either forgot your number or cheated! The number we found is " + ansOut);
				System.out.println("As Log(2)[1001] = ~9, so therefore we could only go through the binary tree 9 times! - You have cheated!");
				break;
			}
			if (ansOut.equals("h")) {  // if number is too low
				counter++;
					lower = randomer; // + 1;
			} else if (ansOut.equals("l")) { // if number is too high
				counter++;
				upper = randomer - 1;
			}
		} 	while (!ansOut.equals("c"));//if correct stop the loop
			System.out.println("Found your number to be " + randomer + " !");
			userInput.close();
	    }
}
