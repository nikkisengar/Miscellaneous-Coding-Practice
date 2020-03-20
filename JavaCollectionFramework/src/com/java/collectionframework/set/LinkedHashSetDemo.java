package com.java.collectionframework.set;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<String> lset = new LinkedHashSet<String>();
		
		Collections.addAll(lset, "B","D","A","C","E");
		
		System.out.println("Initial lset: "+lset);
		
		System.out.println("LinkedHasSet allows duplicate: "+lset.add("B"));
		lset.add(null);
		System.out.println("Updated lset: "+lset);

	}

}
