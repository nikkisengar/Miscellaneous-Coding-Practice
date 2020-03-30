package com.java.collectionframework.map;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		// Default constructor will be used for Default sorting order
		TreeMap t = new TreeMap();
		
		t.put("XXX", 10);
		t.put("AAA", 20);
		t.put("YYY", 5);
		t.put("FFF", 8);
		//t.put(104, 100);
		t.put("CCC", "SSS");
		//t.put(null, "ZZZ");
		System.out.println("TreeMap for default alphabetical sorting order: ");
		System.out.println(t);
	}

}
