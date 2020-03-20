package com.java.collectionframework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		/*
		 * By using ListIterator we can move either to forward or backward direction
		 * 
		 * Hence, ListIterator is called as BIDIRECTIONAL CURSOR
		 * 
		 * Using ListIterator we can perform replacement and addition of new objects
		 * apart from read and remove
		 * 
		 * We can get the ListIterator object by using listIterator() method of List
		 * Interface
		 * 
		 * ListIterator is the child interface of Iterator interface and hence all the
		 * methods of Iterator interface will be available in ListIterator interface
		 * 
		 * LIMITATION: 
		 * ----------- 
		 * 
		 * The most powerful cursor is ListIterator but its
		 * limitation is that it is applicable only for List object
		 * 
		 */

		List<String> list = new LinkedList<String>();

		Collections.addAll(list, "Nikhil", "Kunal", "Rahul", "Sanjay", "Sumit", "Vivek");

		System.out.println("Current list is: " + list);

		ListIterator<String> litr = list.listIterator();

		while (litr.hasNext()) {
			String value = litr.next();

			if (value.equals("Nikhil")) {
				litr.remove();
				System.out.println("list after removing: " + list);
			} else if (value.equals("Kunal")) {
				litr.add("Gautham");
				System.out.println("list after addition: " + list);
			} else if (value.equals("Rahul")) {
				litr.set("Chacha");
				System.out.println("list after updating: " + list);
			} else {
				System.out.println("list: " + list);
			}
		}

	}

}
