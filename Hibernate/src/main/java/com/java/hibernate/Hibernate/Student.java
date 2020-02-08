package com.java.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity is defined to say that this class is allowed to store its data into the database
@Entity (name = "student_table")
public class Student {
	
	//Student properties
	//@Id is used to define the primary key
	@Id
	@Column (name = "Student_Roll_No")
	private int studRollNo;
	private NameDetails nameDetails;
	@Column(name = "Student_Subject")
	private String studSubject;
	@Column(name = "Student_Institute")
	private String studInstitute;
	
	//Setters and Getters
	public int getStudRollNo() {
		return studRollNo;
	}
	public void setStudRollNo(int studRollNo) {
		this.studRollNo = studRollNo;
	}
	public NameDetails getNameDetails() {
		return nameDetails;
	}
	public void setNameDetails(NameDetails nameDetails) {
		this.nameDetails = nameDetails;
	}
	public String getStudSubject() {
		return studSubject;
	}
	public void setStudSubject(String studSubject) {
		this.studSubject = studSubject;
	}
	public String getStudInstitute() {
		return studInstitute;
	}
	public void setStudInstitute(String studInstitute) {
		this.studInstitute = studInstitute;
	}
	
	//Overriding toString() method
	@Override
	public String toString() {
		return "Student [studRollNo=" + studRollNo + ", nameDetails=" + nameDetails + ", studSubject=" + studSubject
				+ ", studInstitute=" + studInstitute + "]";
	}
}
