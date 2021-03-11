package week5;
import java.io.*;
import java.util.*;

public class LongestInFile {
	public static void main(String[] args) {
		boolean fileNotFound = true;//checks if the file is found
		while(fileNotFound) {
			try { //checks if the file is found
				fileNotFound = false;
				Scanner input = new Scanner(System.in);
				System.out.print("Enter file path and name: ");
				String filename = input.nextLine();
				File file = new File( filename);
				Scanner inputFile = new Scanner(file);//convers the Scanner to the String to be able to read
				String space = "";//has an empty string 
				String current;
				  
				while(inputFile.hasNext()) {
					current = inputFile.next();//takes the line of the input
			
					if(current.length() > space.length()) {
						space = current;//whenever a word is found that is LARGER than the previous larger then it makes it the new one, therefore the spcae "" is always larger
					 }
				}
				System.out.println(space);
				  
			}
			catch(IOException e) {
				System.out.println("Error file not found.");
				fileNotFound = true;
			}
		}
	}
}
