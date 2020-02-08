package com.java.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class StudentInfo{
	String studName;
	int studMarks;
	
	//Constructor using fields
	public StudentInfo(String studName, int studMarks) {
		super();
		this.studName = studName;
		this.studMarks = studMarks;
	}
}


public class StudentInformationUsingPredicateAndFunctionAndConsumer {

	public static void main(String[] args) {
		
		ArrayList<StudentInfo> list=new ArrayList<StudentInfo>();
		populate(list);
		
		Predicate<StudentInfo> p=studentInfo->studentInfo.studMarks>=60;
		
		Function<StudentInfo, String> f=studentinfo->{
			
			int studMarks=studentinfo.studMarks;
			
			if(studMarks>=80)
				return "A [Distinction]";
			else if(studMarks>=60)
				return "B [First Division]";
			else if(studMarks>=50)
				return "C [Second Division]";
			else if(studMarks>=35)
				return "D [Thrid Division]";
			else
				return "E [Fail]";
			
		};
		
		Consumer<StudentInfo> c=studentInfo->{
			System.out.println("Student Name: "+studentInfo.studName);
			System.out.println("Student Marks: "+studentInfo.studMarks);
			System.out.println("Student Grade: "+f.apply(studentInfo));
			System.out.println();
		};
		
		for(StudentInfo studentInfo:list) {
			
			if(p.test(studentInfo)) {
				c.accept(studentInfo);
			}
		}
	}

	private static void populate(ArrayList<StudentInfo> list) {
		
		list.add(new StudentInfo("Kunal", 85));
		list.add(new StudentInfo("Nikhil", 45));
		list.add(new StudentInfo("Rahul", 60));
		list.add(new StudentInfo("Sanjay", 79));
	}
}
