package com.java.bi_functional_interfaces;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee{
	int empId;
	String empName;
	double empDailyWage;
	
	public Employee(int empId, String empName, double empDailyWage) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDailyWage = empDailyWage;
	}

	@Override
	public String toString() {
		return "(empId:" + empId + ", empName:" + empName + ", empDailyWage:" + empDailyWage + ")";
	}
}

class TimeSheet{
	int empId;
	int noOfWorkingDays;
	int noOfLeaveTaken;
	public TimeSheet(int empId, int noOfWorkingDays, int noOfLeaveTaken) {
		super();
		this.empId = empId;
		this.noOfWorkingDays = noOfWorkingDays;
		this.noOfLeaveTaken = noOfLeaveTaken;
	}
	@Override
	public String toString() {
		return "(empId:" + empId + ", noOfWorkingDays:" + noOfWorkingDays + ", noOfLeaveTaken:"
				+ noOfLeaveTaken + ")";
	}
}


public class BiFunctionInterfaceToFindEmployeeMonthlySalary {

	public static void main(String[] args) {

		//Employee employee=new Employee(101, "Nikhil", 1500);
		//TimeSheet timeSheet=new TimeSheet(101, 22);
		int count=0;
		
		ArrayList<Employee> list1=new ArrayList<Employee>();
		ArrayList<TimeSheet> list2=new ArrayList<TimeSheet>();
		
		populate(list1);
		
		BiFunction<Employee, TimeSheet, Double> f=(emp,timesheet) -> emp.empDailyWage*(timesheet.noOfWorkingDays-timesheet.noOfLeaveTaken);
	
		
		for(Employee emp:list1) {
			count++;
			TimeSheet t=new TimeSheet(emp.empId, 22, (int)(Math.random()*23));
			System.out.println("Employee Id: "+emp.empId);
			System.out.println("Employee Name: "+emp.empName);
			System.out.println("Employee Monthly Salary: "+f.apply(emp, t));
			System.out.println();
			list2.add(t);
			System.out.println();
			if(list1.size()==count)
			System.out.println(list2);
		}
		
		//System.out.println("Employee "+employee.empName+" monthly salary is: "+f.apply(employee, timeSheet));

	}

	private static void populate(ArrayList<Employee> list1) {
		
		list1.add(new Employee(101, "Kunal", 1200));
		list1.add(new Employee(102, "Nikhil", 900));
		list1.add(new Employee(103, "Rahul", 1000));
		list1.add(new Employee(104, "Sanjay", 1100));
	}
}
