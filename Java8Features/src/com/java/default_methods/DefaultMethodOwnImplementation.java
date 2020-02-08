package com.java.default_methods;

interface DefaultMethod1{
	default void m1() {
		System.out.println("default method...");
	}
}

public class DefaultMethodOwnImplementation implements DefaultMethod1{

	//overriding default method of the interface
	public void m1() {
		System.out.println("My own implementations...");
	}
	
	public static void main(String[] args) {
		
		DefaultMethodOwnImplementation dm=new DefaultMethodOwnImplementation();
		
		dm.m1();

	}

}
