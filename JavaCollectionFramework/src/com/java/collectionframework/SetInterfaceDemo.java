package com.java.collectionframework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {

	public static void main(String[] args) {

		Thread.currentThread().setName("Nikhil");
		
		Set<String> hs = new HashSet<String>();

		hs.add("Yudhisthir");
		hs.add("Bheem");
		hs.add("Arjun");
		hs.add("Sehdev");
		hs.add("Nakul");
		hs.add(null);
		/*
		 * it allows only one null because duplicates are not allowed in set so the 1st
		 * null will be overridden by 2nd null
		 */
		hs.add(null);
		// Set does not allow duplicate and insertion order is not preserved
		hs.add("Nakul");

		System.out.println("HashSet elements: ");
		System.out.println(hs);

		// TreeSet class will always give sorted elements in sorted form (increasing
		// order)
		Set<Integer> ts = new TreeSet<Integer>();

		ts.add(24);
		ts.add(15);
		ts.add(2);

		// duplicates are not allowed and order will be ascending sorting order
		ts.add(24);
		ts.add(35);
		ts.add(10);
		//ts.add(null);

		System.out.println("/nTreeSet elements: ");
		System.out.println(ts);

	}
}
