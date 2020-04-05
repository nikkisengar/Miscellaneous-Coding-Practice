package com.java.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(6);
		list.add(8);
		list.add(4);
		list.add(2);

		System.out.println("List is: " + list);

		List<Integer> unmodifiableList = Collections.unmodifiableList(list);

		// unmodifiableList.add(0); //RE: java.lang.UnsupportedOperationException

		System.out.println("Unmodifiable List is: " + unmodifiableList);

		List<String> listFromArray = new ArrayList<String>(Arrays.asList("One", "Two", "Three"));

		System.out.println("List from array: " + listFromArray);

		
		//Another way
		List<String> unmodifiableListFromArray = Collections.unmodifiableList(listFromArray);

		//unmodifiableListFromArray.add("Four");//RE: java.lang.UnsupportedOperationException

		System.out.println("Unmodifiable List from array: " + unmodifiableListFromArray);
		
		// 2nd approach (Java 9)
		List<String> fruits = new ArrayList<String>(Arrays.asList("Apple","Banana","Cherry"));
		System.out.println("list1: " + fruits);
		
		//List<String> unmodifiableFruits = List.of();

	}

}
