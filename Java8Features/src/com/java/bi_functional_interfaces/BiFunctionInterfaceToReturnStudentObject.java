package com.java.bi_functional_interfaces;

import java.util.ArrayList;
import java.util.function.BiFunction;

//Write a BiFunction to create Student class object by taking Name and RollNo as an input arguments.
class StudentInfo{
	String studName;
	int studRollNo;
	
	//Constructor using fields
	public StudentInfo(String studName, int studRollNo) {
		super();
		this.studName = studName;
		this.studRollNo = studRollNo;
	}
}

public class BiFunctionInterfaceToReturnStudentObject {

	public static void main(String[] args) {
		
		ArrayList<StudentInfo> list=new ArrayList<StudentInfo>();
		
		BiFunction<String, Integer, StudentInfo> bf=(studName,studRollNo)->new StudentInfo(studName, studRollNo);
		
		list.add(bf.apply("Kunal", 101));
		list.add(bf.apply("Nikhil", 102));
		list.add(bf.apply("Rahul", 103));
		list.add(bf.apply("Sanjay", 104));
		
		for(StudentInfo studentInfo:list) {
			System.out.println("Student Name: "+studentInfo.studName);
			System.out.println("Student RollNo: "+studentInfo.studRollNo);
			System.out.println();
		}
	}
}
