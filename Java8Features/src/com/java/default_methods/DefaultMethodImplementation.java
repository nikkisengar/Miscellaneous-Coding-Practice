package com.java.default_methods;

//From Java 1.8 version we can declare the concrete methods inside an interface with the help of default methods
interface DefaultMethod{
	default void m1() {
		System.out.println("default method");
	}
}

public class DefaultMethodImplementation implements DefaultMethod{

	public static void main(String[] args) {
		DefaultMethodImplementation dm=new DefaultMethodImplementation();
	
		//default methods of an interface is by default available to the implementation class
		dm.m1();
	}
}
