package week5;
import java.io.*;
import java.util.*;

public class WordCount {
	public static void main(String[] args) {
		boolean fileNotFound = true;
		while(fileNotFound) {
			try {
				fileNotFound = false;
				Scanner input = new Scanner(System.in);
				System.out.print("Please enter file name with path: ");
				String filename = input.nextLine();
				File file = new File( filename);
				Scanner inputFile = new Scanner(file);
			
				
				int counter = 0;
				  
				while(inputFile.hasNext()){
					inputFile.next();//find if the file has another word in it by a simple next() AS THIS wthis will find a space and next words
					counter++;//counter ++ as everytime a next() is found that means it is one word therefore adding one to the counter making it work
				} 
				  
				System.out.println("Amount of words: " + counter);
			}
			catch(IOException e) {
				System.out.println("Error file not found.");
				fileNotFound = true;
			}
		}
	}
}
