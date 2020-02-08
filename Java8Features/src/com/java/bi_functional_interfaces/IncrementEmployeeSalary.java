package com.java.bi_functional_interfaces;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class EmpInfo{
	String empName;
	double empSalary;
	
	public EmpInfo(String empName, double empSalary) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
	}
}

public class IncrementEmployeeSalary {

	public static void main(String[] args) {

		ArrayList<EmpInfo> list=new ArrayList<EmpInfo>();
		
		BiFunction<String, Double, EmpInfo> f=(empName,empSalary)->new EmpInfo(empName, empSalary);
		
		list.add(f.apply("Durga", 1000.0));
		list.add(f.apply("Bunny", 2000.0));
		list.add(f.apply("Sunny", 3000.0));
		list.add(f.apply("Chinny", 4000.0));
		
		BiConsumer<EmpInfo, Double> c=(emp,salaryIncrement)->emp.empSalary=emp.empSalary+salaryIncrement;
		
		for(EmpInfo emp:list) {
			System.out.println("Employee Name: "+emp.empName);
			System.out.println("Employee Salary before increment: "+emp.empSalary);
			System.out.println();
		}
		
		for(EmpInfo emp:list) {
			c.accept(emp, 500.0);
		}

		System.out.println("=========================================");

		for(EmpInfo emp:list) {
			System.out.println("Employee Name: "+emp.empName);
			System.out.println("Employee Salary after increment: "+emp.empSalary);
			System.out.println();
		}
	}

}
