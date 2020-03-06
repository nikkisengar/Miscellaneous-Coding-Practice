package com.java.composition;

public class CompositionDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Person person = new Person();

		person.setPersonId(1001);
		person.setPersonFirstName("Rahul");
		person.setPersonLastName("Kumar");
		person.getAddressInfo().setAddressLine1("180-B");
		person.getAddressInfo().setAddressLine2("Near More Supremarket");
		person.getAddressInfo().setCity("Hyd");
		person.getAddressInfo().setStreet("SR Nagar");

		System.out.println(person);
		
		//setting person as null to show that AddressInfo object will not be present if there is no Person object
		person = null;
		
		System.out.println("-------------------------------------------");		
		System.out.println(person);
		
		if(person!=null) {
			System.out.println(person.getAddressInfo());
		}
		else {
			System.out.println("Address does not exist...");
		}
	}

}
