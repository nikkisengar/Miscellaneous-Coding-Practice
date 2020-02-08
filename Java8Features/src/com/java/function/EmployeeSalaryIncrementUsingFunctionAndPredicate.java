package com.java.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee1{
	String empName;
	double empSalary;
	
	public Employee1(String empName,double empSalary) {
		
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	public String toString() {
		return empName+":"+empSalary;			
	}
}

public class EmployeeSalaryIncrementUsingFunctionAndPredicate {

	public static void main(String[] args) {
		
		ArrayList<Employee1> list1=new ArrayList<Employee1>();
		populate(list1);

		System.out.println("Before Increment: "+list1);
		
		Predicate<Employee1> isSalaryLessThan3500=emp->emp.empSalary<3500;
		Function<Employee1, Employee1> salaryIncrement=emp->{
			emp.empSalary = emp.empSalary + 477;
			return emp;
		};
		
		ArrayList<Employee1> list2=new ArrayList<Employee1>();
		for(Employee1 emp:list1) {
			if(isSalaryLessThan3500.test(emp)) {
				salaryIncrement.apply(emp);
				list2.add(emp);
			}
		}
		
		System.out.println("\nAfter Increment: "+list1);
		System.out.println("\nEmployees whose salary is incremented are: "+list2);
		
	}

	private static void populate(ArrayList<Employee1> list1) {
		
		list1.add(new Employee1("Sunny", 1000));
		list1.add(new Employee1("Bunny",2000));
		list1.add(new Employee1("Chinny", 3000));
		list1.add(new Employee1("Pinny", 4000));
		list1.add(new Employee1("Kanny", 5000));		
	}
}
