package com.java.collectionframework.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {

		NavigableSet<String> fruitsNavigableSet = new TreeSet<String>();

		fruitsNavigableSet.add("Apple");
		fruitsNavigableSet.add("Banana");
		fruitsNavigableSet.add("Cherry");
		fruitsNavigableSet.add("Dates");
		fruitsNavigableSet.add("Elderberry");

		System.out.println("Fruits set: " + fruitsNavigableSet);

		System.out.println(fruitsNavigableSet.ceiling("Banana"));

	}

}
