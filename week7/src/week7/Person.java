package week7;

import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Calendar;



public class Person {
	static String name;
	static LocalDate DoB;//use localDate as calculations are easier to be made and Date has been removed
	
	Person(String name, LocalDate DoB){//constructor
		
		this.name = name;//intialise the variable name with the constructor
		
		this.DoB = DoB;//initialise the variable date of birth with the constructor
	
	}
	
	String getName() {
		return name;
	}
	
	int getAge(){//return the age of the Person
	    LocalDate now = LocalDate.now();//get todays LocalDate 'now'
	    return Period.between(DoB, now).getYears();//calucaltion to find the years between today and the date of birth
	}
	
	public String toString() {//toString() method to return all the functions into a string 
		return "Name: " + name + " | Age: " + getAge() + " | Date of Birth: " + DoB;
	}
	
}
