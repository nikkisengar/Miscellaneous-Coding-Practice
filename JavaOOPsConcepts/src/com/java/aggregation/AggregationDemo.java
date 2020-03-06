package com.java.aggregation;

public class AggregationDemo {

	public static void main(String[] args) {

		Address address = new Address();

		address.setAddressLine1("180-B");
		address.setAddressLine2("Near BK Guda Park");
		address.setCity("Hyderabad");
		address.setStreet("SR Nagar");

		Employee employee = new Employee();
		
		employee.setEmpId(101);
		employee.setEmpFirstName("Rahul");
		employee.setEmpLastName("Kumar");
		employee.setEmpAge(18);
		employee.setAddress(address);
		
		System.out.println(employee);
		
		//setting employee to null in order to show that address object can exist even if the employee object is not present
		employee=null;

		System.out.println("--------------------------------------------------");
		System.out.println(employee);
		System.out.println(address);
	}
}
