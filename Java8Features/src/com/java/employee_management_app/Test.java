package com.java.employee_management_app;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Employee> list =new ArrayList<Employee>();
		
		list.add(new Employee("Nikhil", "Support Engineer", 15000.50, "Hyderabad"));
		list.add(new Employee("Vikas", "Software Developer", 30000.50, "New Delhi"));
		list.add(new Employee("Alok", "Assistant Manager", 20000.00, "Ahemdabad"));
		list.add(new Employee("Ritesh", "Accountant", 25000.00, "Bhopal"));
		
		System.out.println(list);

	}

}
