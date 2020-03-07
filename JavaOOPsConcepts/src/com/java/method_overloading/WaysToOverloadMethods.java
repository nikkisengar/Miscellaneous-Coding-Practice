package com.java.method_overloading;

/*
 * In overloading method resolution always taken care by compiler based on reference type. 
 * Hence, overloading is also called as COMPILE TIME POLYMORPHISM 
 * or STATIC POLYMORPHISM 
 * or EARLY BINDING
 */
public class WaysToOverloadMethods {

	public void m1() {
		System.out.println("no-arg");
	}

	public void m1(int a) {
		System.out.println("int-arg");
	}

	public void m1(double d) {
		System.out.println("double-arg");
	}

	public void m1(String s) {
		System.out.println("String-arg");
	}

	private int m1(int a, int b) {
		return (a + b);
	}
	
	protected void m1(float a, int b) {
		System.out.println("float-int arg");
	}
	
	void m1(int a, float b) {
		System.out.println("int-float arg");
	}
	

	public static void main(String[] args) {

		WaysToOverloadMethods ways = new WaysToOverloadMethods();

		ways.m1();
		ways.m1(10);
		ways.m1(10.5);
		ways.m1("S");
		ways.m1('a');
		ways.m1(5, 5);
		ways.m1(10.5f, 4);
		ways.m1(3,1.2f);
		//ways.m1(10.5f,10.5f);
	}
}
