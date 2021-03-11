package week7;

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Testing {

	public static void main(String[] args) {

		double[] marks1 = new double[] {70,70,70,70,70,70};
		Person person0 = new Person("Mike", LocalDate.of(1990, Month.APRIL, 26));
		System.out.println(person0.getAge());
		System.out.println(person0.getName());
		System.out.println(person0.toString());
		System.out.println();
		
		Person person1 = new Student("Ahmed", LocalDate.of(1998, Month.JANUARY, 29), "001", marks1);
		System.out.println(person1.getAge());
		System.out.println(person1.getName());
		System.out.println(((Student) person1).getFinalMark());
		System.out.println(((Student) person1).getGrade());		
		System.out.println(person1.toString());
		System.out.println();
		
		Student person2 = new UndergraduateStudent("Chel", LocalDate.of(1995, Month.JANUARY, 01), "002", marks1, 2016, "Computer Science");
		System.out.println(person2.getAge());
		System.out.println(person2.getName());
		System.out.println(person2.getFinalMark());
		System.out.println(person2.getGrade());
		System.out.println(person2.toString());
	
	}

}
