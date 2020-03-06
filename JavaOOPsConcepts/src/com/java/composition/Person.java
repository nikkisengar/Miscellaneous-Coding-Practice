package com.java.composition;

public class Person {

	private int personId;
	private String personFirstName;
	private String personLastName;
	private AddressInfo addressInfo;

	// Composition in Java
	// creating the object of AddressInfo class as soon as Person class is
	// instantiated.
	public Person() {
		addressInfo = new AddressInfo();
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonFirstName() {
		return personFirstName;
	}

	public void setPersonFirstName(String personFirstName) {
		this.personFirstName = personFirstName;
	}

	public String getPersonLastName() {
		return personLastName;
	}

	public void setPersonLastName(String personLastName) {
		this.personLastName = personLastName;
	}

	public AddressInfo getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(AddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}

	// toString()
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personFirstName=" + personFirstName + ", personLastName="
				+ personLastName + ", addressInfo=" + addressInfo + "]";
	}
}
