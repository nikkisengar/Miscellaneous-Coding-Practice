package com.java.collectionframework.set;

import java.util.HashSet;
import java.util.Set;

public class InternalWorkingOfHashSet {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<String>();

		// HashSet class add(-) method will internally call the HashMap class put method
		// and add the the key from the argument of add(-) method with the value called
		// PRESENT and verify for the first time if the key-value entry is present in
		// the Map or not if it is present than it will return the value=PRESENT which
		// is not null and if it not present then the put method return null and the
		// key-value will be inserted in the Map
		System.out.println(hashSet.add("Hi"));
		System.out.println(hashSet.add("Hello"));
		System.out.println(hashSet.add("Hi"));
		
		System.out.println(hashSet);
	}
}
