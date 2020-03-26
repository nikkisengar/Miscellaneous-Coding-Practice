package com.java.collectionframework.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetForStringOrder {

	public static void main(String[] args) {

		// Default sorting order for String is Alphabetical order
		TreeSet<String> t = new TreeSet<String>(new MyComparator1());

		t.add("Roja");
		t.add("Shobha Rani");
		t.add("Raja Kumari");
		t.add("Ganga Bhavani");
		t.add("Ramulamma");

		System.out.println("TreeSet: " + t);

	}

}

class MyComparator1 implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		// return -s1.compareTo(s2);
		return s2.compareTo(s1);
	}

}