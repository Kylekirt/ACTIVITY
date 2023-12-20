package main;

public class Student {

	
	 String firstName, lastName, year, course, section;
	 float midtermGrade, finalGrade;
	 
	 Student(String firstName,
			 String lastName, 
			 String year, 
			 String course, 
			 String section,
			 float midtermGrade,
			 float finalGrade ){
		 
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.year = year;
		 this.course = course;
		 this.section= section;
		 this.midtermGrade = midtermGrade;
		 this.finalGrade = finalGrade;
		
	 }
	 
	 void introduceSelf() {
		 System.out.println("Full Name :" + firstName +" " + lastName);
		 System.out.println("Course    :" + course);
		 System.out.println("Year      :" + year);
		 System.out.println("Section   :" + section);
	
	 }
}
