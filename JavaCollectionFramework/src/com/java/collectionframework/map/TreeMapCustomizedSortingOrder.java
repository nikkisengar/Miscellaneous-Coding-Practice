package com.java.collectionframework.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapCustomizedSortingOrder {

	public static void main(String[] args) {

		TreeMap<String, Integer> t = new TreeMap<String, Integer>(new MyComparator());

		t.put("XXX", 10);
		t.put("AAA", 20);
		t.put("ZZZ", 30);
		t.put("LLL", 40);

		System.out.println("TreeMap for reverse alphabetical sorting order: \n" + t);
	}

}

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1); // reverse order of alphabetical order
	}
}
