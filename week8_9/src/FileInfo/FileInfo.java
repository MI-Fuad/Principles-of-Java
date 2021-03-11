package FileInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FileInfo {
	public static void wordCounter(String _file) {
		try {
			File file = new File(_file);
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
		}
	}
	@SuppressWarnings("unchecked")
	public static void wordOccurrences(String _file) throws FileNotFoundException {
		Map<String, Integer> occurrence = new HashMap<>();
		String[] a;//variable to hold the split value of input. To make it into an array/list
		File file = new File(_file);
		Scanner inputFile = new Scanner(file);//convers the Scanner to the String to be able to read
		String st = "";//has an empty string 
		String current;
		  
		while(inputFile.hasNext()) {
			current = inputFile.next();//takes the line of the input
			st = st + " " + current;
		}
		//System.out.println(st);		
		
		
		a = st.split(" ");//split a string input into an array to allow searching easier
		for(String wordSearch : a) {//This is a shorter for loop to search in arrays/list its defined as for(variable : 'in' array[])
			if(wordSearch == null || wordSearch.trim().equals("")) {//if find nothing or space carry on with the loop 
				continue;
			}
			String lower = wordSearch.toLowerCase();//change all letters to lower case to make search values accurate
			lower = lower.replace(",", "");//removal of commas and full stops to make the search more accurate.
			lower = lower.replace(".", "");
			if(occurrence.containsKey(lower)) {//if hashmap contains any of the wordSearch values in lower case do this:
				occurrence.put(lower, occurrence.get(lower) + 1);// add the word and add the previous 
				//value of the occurance +1 so prints out (word = how many times)
			} else {//else
				occurrence.put(lower, 1);//put the word value as 1, so when it finds itt the frist time.
			}
		}
		System.out.println();
		System.out.println(occurrence);//print the list of the words and occurances in the sentence.	
		System.out.println();
		System.out.println("Total number of different: " + occurrence.size());
		System.out.println();
		System.out.println("Top 20 items are: ");
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(occurrence.entrySet());
		Collections.sort(list, new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o2, Entry<String, Integer> o1) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
			
		});
		
		for(int i = list.size()-1; i > list.size()-21; i--) {
			System.out.print(list.get(i) + ", ");
		}
		
	}
}
