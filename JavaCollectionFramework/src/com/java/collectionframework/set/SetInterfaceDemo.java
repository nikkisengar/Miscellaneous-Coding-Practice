package com.java.collectionframework.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetInterfaceDemo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");
		
		//Collections.addAll(set, "A","B","C","D","E","F");
		System.out.println("Initial set: "+set);
		
		set.add(null);
		System.out.println("Duplicate allowed in set: "+set.add("A"));
		System.out.println("Updated set: "+set);
		

	}

}
