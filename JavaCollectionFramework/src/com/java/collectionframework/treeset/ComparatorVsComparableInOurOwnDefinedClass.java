package com.java.collectionframework.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {

	String empName;
	int empId;

	public Employee(String empName, int empId) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {

		return empName + "<-->" + empId;
	}

	@Override
	public int compareTo(Employee e) {
		int empId1 = this.empId;
		int empId2 = e.empId;

		if (empId1 < empId2)
			return -1;
		else if (empId1 > empId2)
			return +1;
		else
			return 0;
	}
}

public class ComparatorVsComparableInOurOwnDefinedClass {

	public static void main(String[] args) {
		Employee e1 = new Employee("Nikhil", 100);
		Employee e2 = new Employee("Akhil", 50);
		Employee e3 = new Employee("Vikhil", 20);
		Employee e4 = new Employee("Sakhil", 90);
		Employee e5 = new Employee("Chakhil", 70);

		TreeSet<Employee> t = new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);

		System.out.println("TreeSet for Default Sorting Order: " + t);

		TreeSet<Employee> t1 = new TreeSet<Employee>(new MyComparator5());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);

		System.out.println("TreeSet for customized Sorting Order:" + t1);
	}
}

class MyComparator5 implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		String s1 = e1.empName;
		String s2 = e2.empName;

		return s1.compareTo(s2);
	}

}
