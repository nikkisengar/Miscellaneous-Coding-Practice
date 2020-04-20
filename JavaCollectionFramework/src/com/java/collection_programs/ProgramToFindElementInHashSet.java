package com.java.collection_programs;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramToFindElementInHashSet {

	public static void main(String[] args) {

		// List<Integer> list = Arrays.a
		Set<Integer> hashSet = new HashSet<Integer>();

		Collections.addAll(hashSet, 12, 4, 8, 10, 4, 20);

		System.out.println("HashSet: " + hashSet);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to find in the set: ");
		int elementToFind = sc.nextInt();

		System.out.println("Is " + elementToFind + " present in the HashSet: " + hashSet.contains(elementToFind));
	}

}
