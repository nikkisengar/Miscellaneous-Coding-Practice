package com.java.collectionframework;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		/*
		 * Enumeration Interface is used to get the objects one by one from Legacy
		 * Collections Objects. We can get Enumeration object by using elements() method
		 * of Vector class
		 * 
		 * While traversing the vector class we need to use hasMoreElements() and
		 * nextElement()
		 * 
		 * LIMITATION: 
		 * ----------- 
		 * 1) Enumeration can be only used for Legacy classes
		 * and its not a UNIVERSAL cursor 
		 * 2) Using Enumeration we can get only
		 * READ-ACCESS and we can't perform REMOVE OPERATION
		 *
		 * To Overcome the above problem Iterator Interface came
		 *
		 */

		Vector<String> names = new Vector<String>();
		Collections.addAll(names, "A", "B", "C", "D", "E", "F");

		Enumeration<String> enumeration = names.elements();

		// printing the vector elements
		System.out.println("Names are: " + names);

		while (enumeration.hasMoreElements()) {
			String value = enumeration.nextElement();

			if (value.equals("A") || value.equals("C") || value.equals("E")) {
				System.out.println(value);
			} else {
				names.remove(value);
				System.out.println(value);
			}
		}
		System.out.println(names);

	}

}
