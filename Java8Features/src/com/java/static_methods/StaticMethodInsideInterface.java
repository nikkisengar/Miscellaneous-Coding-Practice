package com.java.static_methods;

interface StaticMethod{
	public static void m1() {
		System.out.println("Interface static method...");
	}
}

public class StaticMethodInsideInterface implements StaticMethod {

	public static void main(String[] args) {
		
		//StaticMethodInsideInterface sm=new StaticMethodInsideInterface();
		//sm.m1();
		
		//StaticMethodInsideInterface.m1();
		
		StaticMethod.m1();
		

	}

}
