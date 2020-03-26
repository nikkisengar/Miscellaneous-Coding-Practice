package com.java.collectionframework.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetForStringBufferSortingOrder {

	public static void main(String[] args) {

		// If we are not using the MyComparator2 object as an argument for the TreeSet
		// constructor then we will get ClassCastException
		TreeSet<StringBuffer> t = new TreeSet<StringBuffer>(new MyComparator2());
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("K"));

		System.out.println("TreeSet<StringBuffer>: " + t);
	}

}

class MyComparator2 implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {

		String s1 = o1.toString();
		String s2 = o2.toString();

		return s1.compareTo(s2);// Alphabetical order
	}

}