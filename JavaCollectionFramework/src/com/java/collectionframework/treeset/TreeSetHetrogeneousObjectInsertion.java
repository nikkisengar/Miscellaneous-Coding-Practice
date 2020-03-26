package com.java.collectionframework.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetHetrogeneousObjectInsertion {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator4());

		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");

		System.out.println("TreeSet Hetrogeneous objects: " + t);
	}

}

class MyComparator4 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int l1 = s1.length();
		int l2 = s2.length();

		if (l1 < l2) {
			return -1;
		} else if (l1 > l2) {
			return +1;
		} else {
			return s1.compareTo(s2);
		}
	}

}