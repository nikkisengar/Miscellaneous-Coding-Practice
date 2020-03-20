package com.java.collectionframework.set;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {

		SortedSet<Integer> integers = new TreeSet<Integer>();

		/*
		 * integers.add(101); integers.add(90); integers.add(20); integers.add(100);
		 * integers.add(80);
		 */
		Collections.addAll(integers, 101, 90, 20, 100, 80, 50, 95);

		System.out.println("SortedSet: "+integers);

	}

}
