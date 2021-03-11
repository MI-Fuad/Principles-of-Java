package week5;

import java.io.*;
import java.io.IOException;
import java.util.*;

public class ReverseFile {
	public static void main(String[] args) {
		boolean fileNotFound = true;//checks if the file is found
		while(fileNotFound) {
			try {///checks if the file is found 
				fileNotFound = false;
				Scanner userInput = new Scanner(System.in);//take the user inputer via scanner
				System.out.print("Please enter file want to read from: ");
				Scanner inputFile = new Scanner(new File( userInput.nextLine()));//takes the input file next line converts it into a string so it can be help into inputFile
				
				String[] holder = inputFile.nextLine().split(" ");//splits all the words seperated in an array and stored via spaces
 
				System.out.print("Please enter file want to write to: ");
				Scanner outf = new Scanner(System.in);//takes the user input of the output file where to be stored
				String outStr = outf.nextLine();
				PrintWriter fileWriter = new PrintWriter(outStr);//converst the Scanner to a string so it can be help into PrintWrtier
				
				for(int i = holder.length - 1 ; i >= 0; i--) {
					//System.out.println(holder[i]); 
					fileWriter.println(holder[i]);//writes all the indexes into the file backwards because of a backwards loop
				}			
				
				inputFile.close();
				outf.close();
				userInput.close();
				fileWriter.close();
			}
			catch(IOException e) {
				System.out.println("Error file not found.");//if catches an error then do this
				fileNotFound = true;
			}
		}
	}
}
