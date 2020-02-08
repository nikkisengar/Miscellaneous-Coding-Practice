package com.java.employee_management_app;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeManagementTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		populate(list);
		
		Predicate<Employee> p=emp->emp.empDesignation.equals("Manager");
		System.out.println("Requested Information: \n");
		display(p,list);
		
		Predicate<Employee> p1=emp->emp.empCity.equals("Bangalore");
		System.out.println("Employees from Bangalore: \n");
		display(p1,list);
		
		Predicate<Employee> p2=emp->emp.empSalary<20000;
		System.out.println("Employees having salary less than 20000: \n");
		display(p2,list);
		
		System.out.println("Employees who are Manager and belongs to Bangalore location: \n");
		display(p.and(p1), list);
		
		System.out.println("Empoyees who are Manager or having salary < 20000: \n");
		display(p.or(p2), list);
		
		System.out.println("Employees who are not Manager: \n");
		display(p.negate(), list);

	}
	
	public static void populate(ArrayList<Employee> list) {
		
		list.add(new Employee("Durga", "CEO", 30000, "Hyderabad"));
		list.add(new Employee("Sunny", "Manager", 20000, "Hyderabad"));
		list.add(new Employee("Mallika", "Manager", 20000, "Bangalore"));
		list.add(new Employee("Kareena", "Lead", 15000, "Hyderabad"));
		list.add(new Employee("Katrina", "Lead", 15000, "Bangalore"));
		list.add(new Employee("Anushka", "Developer", 10000, "Hyderabad"));
		list.add(new Employee("Dhanush", "Developer", 10000, "Hyderabad"));
		list.add(new Employee("Salman", "Developer", 10000, "Bangalore"));
		list.add(new Employee("Karthik", "Developer", 10000, "Bangalore"));
	}
	
	public static void display(Predicate<Employee> p,ArrayList<Employee> list) {
		for(Employee emp: list) {
			if(p.test(emp)) {
				System.out.println(emp);
			}
		}
		System.out.println("************************************************************");
	}
}
