package com.java.function;

import java.util.ArrayList;
import java.util.function.Function;

class Student{
	String studName;
	int studMarks;
	
	//constructor using fields
	public Student(String studName, int studMarks) {
		super();
		this.studName = studName;
		this.studMarks = studMarks;
	}
}

public class FunctionInterfaceToFindGradeOfStudentBasedOnMarks {

	public static void main(String[] args) {
	
		ArrayList<Student> al=new ArrayList<Student>();
		populate(al);
		
		Function<Student, String> f= stud->{
			int studMarks=stud.studMarks;
			
			if(studMarks>=80)
				return "A [Distinction]";
			else if(studMarks>=60)
				return "B [First Division]";
			else if(studMarks>=50)
				return "C [Second Division]";
			else if(studMarks>=35)
				return "D [Third Division]";
			else
				return "Fail";
		};
		
		display(al,f);
		
		/*
		 * for(Student stud: al) { System.out.println("Student Name: "+stud.studName);
		 * System.out.println("Student Marks: "+stud.studMarks);
		 * System.out.println("Student Grade: "+f.apply(stud));
		 * System.out.println("**********************************"); }
		 */
	}

	private static void display(ArrayList<Student> al, Function<Student, String> f) {
		for(Student stud: al) {
			System.out.println("Student Name: "+stud.studName);
			System.out.println("Student Marks: "+stud.studMarks);
			System.out.println("Student Grade: "+f.apply(stud));
			System.out.println("**********************************");
		}
	}

	private static void populate(ArrayList<Student> al) {
		al.add(new Student("Sunny", 90));
		al.add(new Student("Bunny", 70));
		al.add(new Student("Chinny", 55));
		al.add(new Student("Kanny", 45));
		al.add(new Student("Panny", 30));
	}

}
