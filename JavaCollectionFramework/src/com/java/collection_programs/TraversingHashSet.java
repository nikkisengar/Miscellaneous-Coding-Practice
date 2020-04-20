package com.java.collection_programs;

import java.util.HashSet;
import java.util.Set;

public class TraversingHashSet {

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(102);
		hashSet.add(101);
		hashSet.add(101);
		hashSet.add(105);
		hashSet.add(103);

		for (int i : hashSet) {
			System.out.println(i);
		}

	}

}
