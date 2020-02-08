package com.java.employee_management_app;

public class Employee {
	
	//properties
	String empName;
	String empDesignation;
	double empSalary;
	String empCity;
	
	//Constructor using fields
	public Employee(String empName, String empDesignation, double empSalary, String empCity) {
		super();
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
		this.empCity = empCity;
	}

	// overriding toString() method
	public String toString() {
		String str=String.format("%s, %s, %.2f, %s", empName,empDesignation,empSalary,empCity);
		return str;
	}
	
}
