package com.java.collectionframework.treeset;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		// TreeSet without any argument gives the Default natural sorting order
		// (Ascending order)
		// For TreeSet without any argument, JVM internally calls the compareTo(Object
		// obj1) method of Comparable interface which will give the default natural
		// sorting order (Ascending order)
		TreeSet t = new TreeSet();

		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");

		// TreeSet: all object are inserted into some natural sorting order
		// TreeSet does not allows heterogeneous objects because it requires comparison
		// t.add(null); //RE: NPE
		// t.add(10); //RE: CCE
		System.out.println("TreeSet:" + t);
	}

}
