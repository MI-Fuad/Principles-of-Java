package week5;

import java.io.*;
import java.io.IOException;
import java.util.*;

public class WordOccurenceInFile {
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
				System.out.println("enter the word");
				String word= input.next();
			
				
				  int counter = 0;
				  
				  while(inputFile.hasNext()){
					  if(inputFile.next().equals(word)) //if statment to check if the word is actualy found and equal to the word
				      	counter++;//add one to the counter while the word is found
				    } 
				  
				  System.out.println("Amount of occurencses of the word " + word + " is " + counter);
				  
			}
			
			catch(IOException e) {
				System.out.println("Error file not found.");
				fileNotFound = true;
			}
		}
	}
}
