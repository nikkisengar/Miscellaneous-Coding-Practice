package com.java.collection_overview;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int eno;
	String ename;
	
	Employee(int eno, String ename){
		this.eno=eno;
		this.ename=ename;
	}

	@Override
	public String toString() {
		return eno + ":" + ename;
	}
}

public class OurOwnClassSorting {

	public static void main(String[] args) {
		
		/*
		 * Employee e1=new Employee(101, "Nikhil"); System.out.println(e1);
		 */
		ArrayList<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee(200, "Deepika"));
		l.add(new Employee(400, "Sunny"));
		l.add(new Employee(300, "Mallika"));
		l.add(new Employee(100, "Katrina"));
		
		System.out.println("Before Sorting (Insertion Order): "+ l);
		
		Collections.sort(l,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		System.out.println("After Sorting (Ascending order): "+l);
		
		Collections.sort(l,(e1,e2)->(e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0);
		System.out.println("After Sorting (Descending order): "+l);
	}
}
