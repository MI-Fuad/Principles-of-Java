package week7;


import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Period;

public class Student extends Person{//Student is an inheritence from Person

	String studentID;//take a string of the studetn iD 
	double[] marks;//input an array of the marks 
	
	Student(String name, LocalDate DoB, String studentID, double[] marks){
		super(name, DoB);//get the constructor variable of the super, name and DoB
		this.studentID = studentID;//initialise student Id
		this.marks = marks;//initialise the marks
	}
	
	double getFinalMark() {//get the final mark average of all the marks inputted
		double sum = 0;//inital sum would be 0 
		double average = 0;
		for(int i = 0; i < 6; i++) {
			sum = sum + marks[i];//add the value inside the index of i to the sum
		}
		average = sum/marks.length;//work out the average by dividing the sum by amount of marks (length)
		return average;
	}
	
	String getGrade() {//get letter grade of the student
		
		if(getFinalMark() < 50) {//anything less than 50 a F 
			return "F";
		}
		else if(getFinalMark() >= 50 && getFinalMark() < 60) {//D between 50 and 60
			return "D";
		}
		else if(getFinalMark() >= 60 && getFinalMark() < 70) {//B between 60 and 70
			return "B";
		}
		else{//anything else, which is everything above 70, is an A 
			return "A";
		}
	}
	
	public String toString() {//return a toString() method that prints the values to a string
		return super.toString() + " | Student ID: " + studentID + " | Grade: "
				+ getGrade() + "| Final Mark " + getFinalMark();
	}
	
}
