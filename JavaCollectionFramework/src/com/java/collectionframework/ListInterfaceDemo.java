package com.java.collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceDemo {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();

		// (alt + shift + R) for correcting multiple names
		al.add("Joy");
		al.add("Kunal");
		al.add("Nikhil");
		al.add("Pullu");
		al.add("Rahul");
		al.add("Sanjay");
		al.add("Vivek");

		// List allows duplicates and Insertion order is preserved
		al.add("Nikhil");

		System.out.println("ArrayList elements: ");
		System.out.println(al);

		List<String> ll = new LinkedList<String>();
		ll.add("Kevin");
		ll.add("Peter");
		ll.add("Warner");
		ll.add("Smith");
		ll.add("Eon");

		// List allows duplicates and Insertion order is preserved
		ll.add("Kevin");

		System.out.println("\nLinkedList elements: ");
		System.out.println(ll);

	}

}
