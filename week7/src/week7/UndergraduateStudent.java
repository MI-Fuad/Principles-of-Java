package week7;

import java.util.Date;
import java.time.LocalDate;
import java.time.Period;

public class UndergraduateStudent extends Student{//Undergrad inherits from the Student class

	int year;
	String program;
	
	public UndergraduateStudent(String name, LocalDate DoB, String studentID, double[] marks, int year, String program) {

		super(name, DoB, studentID, marks);//get the values of the super of Undergrad which is Student
		//then that will get the super of Student which is Person, so it will be Person > Student > Undergrad
		this.year = year;//intialise the year
		this.program = program;//intialise the program
		
	}
	
	int getYear() {//return the year
		return year;
	}
	
	String getProgram() {//return the program
		return program;
	}
	
	double getFinalMark() {//get average of the top 3 makrs in the marks array 

		int i;
	    double large[] = new double[3];//initialise the array as length 3 to only keep the top 3 
	    double max = 0;
	    for (int j = 0; j < 3; j++) {//for loop of 3 top compare the index of j to the index of i to see which one is larger,
	    	//to find the only top 3 
	        max = marks[0];//make max the first element so there is a compare 
	        for (i = 1; i < marks.length; i++) {
	            if (max < marks[i]) {
	            		max = marks[i];
	            }
	        }
	        large[j] = max;
	        //marks[index] = Integer.MIN_VALUE;
	        
	    }
	    max = large[0] + large[1] + large[2];//add up the largest 3 

	    double avg = max/3;//find the average of those 3 
	    return avg;
	}
	
	String getGrade() {
		//System.out.println(super.getFinalMark());
		if(getFinalMark() >= 40 && getFinalMark() < 50) {//anything betwwen 40 to 50 is a Pass
			return "Pass";
		}else if(getFinalMark() < 40){//less than 40 is a Fail
			return "Fail";
		}else if(getFinalMark() >= 60 && getFinalMark() < 70) {//anything else returns the letter grade of the students class which is 50 to 60 and then more than 70 
			return "B";
		}else {
			return "A";
		}
		
	}
	
	public String toString() {//return the toString() method of all the values to make a string to out put 
		return super.toString() + " | Year: " + getYear() + " | Program: " + getProgram() + " | Final Mark (top 3): " + getFinalMark() + " | Grade: " + getGrade();
	}

}
