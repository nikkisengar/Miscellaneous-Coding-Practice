package com.java.collection_programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class ProgramToTraverseArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(101);
		arrayList.add(102);
		arrayList.add(100);
		arrayList.add(105);

		// for loop
		System.out.println("Traversing ArrayList element using for loop: ");
		for (int i = 0; i < arrayList.size(); i++) {

			System.out.println(arrayList.get(i));
		}

		// advanced for loop
		System.out.println("Traversing ArrayList element using advanced for loop: ");
		for (int i : arrayList) {
			System.out.println(i);
		}

		// System.out.println("Traversing ArrayList using while loop: ");
		// while(arrayList.)

		// ListIterator
		System.out.println("Traversing ArrayList using listIterator: ");
		ListIterator<Integer> itr = arrayList.listIterator();
		while (itr.hasNext()) {
			int i = itr.next();
			System.out.println(i);
		}

		// forEach() method
		System.out.println("Traversing ArrayList using forEach() method: ");
		arrayList.forEach(number -> System.out.println(number));
	}

}
