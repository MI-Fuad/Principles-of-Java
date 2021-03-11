package week4;
import java.util.*;
public class Exercise5 {
	public static void main(String[] args) {
		
		String input= "Studying at Goldsmiths College, University of London. Students need to work harder to achieve a first class degree at Goldsmiths .";
		
		wordOccurrences(input);
	
	}
	
	public static void wordOccurrences(String st) {

		Map<String, Integer> occurrence = new HashMap<>();

		String[] a;//variable to hold the split value of input. To make it into an array/list
		
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

		System.out.println(occurrence);//print the list of the words and occurances in the sentence.
						
	}
	
}