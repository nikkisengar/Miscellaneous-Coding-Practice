package com.java.method_overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
	public void property() {
		System.out.println("Cash + Land + Gold");
	}

	public void marriage() throws IOException {
		System.out.println("Subha Laxmi");
	}
}

class Child extends Parent {
	
	public void marriage() throws FileNotFoundException,EOFException{
		System.out.println("Naina");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) throws IOException {

		Parent p = new Parent();
		p.marriage();
		
		
		Child c = new Child();
		c.marriage();
		
		Parent p1 = new Child();
		p1.marriage();
		
	}

}
