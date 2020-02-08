package com.java.function;

import java.util.ArrayList;
import java.util.function.Function;

class Employee{
	String empName;
	double empSalary;
	
	Employee(String empName,double empSalary){
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	public String toString() {
		return empName+":"+empSalary;
	}
}

public class FunctionInterfaceToFindTotalSalaryOfAllEmployees {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		populate(al);
		
		System.out.println("Employees Information: \n"+al+"\n");
		Function<ArrayList<Employee>, Double> f=list->{
			double totalSalary = 0;
			
			for(Employee emp:al) {
				totalSalary = totalSalary + emp.empSalary;
			}
			return totalSalary;
		};

		System.out.println("Total Monthly Salary of all the Employees: "+f.apply(al));
	}

	private static void populate(ArrayList<Employee> al) {
		
		al.add(new Employee("Sunny", 1000));
		al.add(new Employee("Bunny", 2000));
		al.add(new Employee("Chinny", 3000));
		al.add(new Employee("Pinny", 4000));
		al.add(new Employee("Kanny", 5000));
		al.add(new Employee("Durga", 15000));
	}

}
