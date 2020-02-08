package com.java.default_methods;

interface Left{
	default void m1() {
		System.out.println("Left default method...");
	}
}

interface Right{
	default void m1() {
		System.out.println("Rigth default method...");
	}
}

//When we are using the default methods in the multiple interfaces with same signature will give ambiguity problem
// CE: Duplicate default methods named m1 with the parameters () and () are inherited from the types Right and Left
public class DefaultMethodInMultipleInheritance implements Left, Right{

	// To remove the ambiguity problem we can provide our own implementation of the default method or We can also use the Interface implementation as per our requirement.
	
	// Solution 1
	/*
	 * public void m1() { System.out.println("My own implementation..."); }
	 */
	 
	
	//Solution 2
	public void m1() {
		Left.super.m1(); // or Right.super.m1();
	}
	
	public static void main(String[] args) {
		DefaultMethodInMultipleInheritance d=new DefaultMethodInMultipleInheritance();
		d.m1();
	}
}
