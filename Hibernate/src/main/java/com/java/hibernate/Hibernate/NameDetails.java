package com.java.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Embeddable annotation will take the NameDetails class and insert into Student table with out creating its own table
@Embeddable
public class NameDetails {
	@Column(name = "First_Name")
	private String firstName;
	@Column(name = "Middle_Name")
	private String middleName;
	@Column(name = "Last_Name")
	private String lastName;
	
	//getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "NameDetails [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}
}
