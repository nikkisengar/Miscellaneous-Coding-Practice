package com.java.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {

		/*
		 * We can apply the Iterator concept for any collection object, hence it is a
		 * UNIVERSAL CURSOR
		 * 
		 * By using Iterator we can perform Read-Access and Remove operations
		 * 
		 * We can create/get Iterator object by using iterator() method of Collection
		 * Interface
		 * 
		 * We can iterator a collection using hasNext(), next(), remove() methods of
		 * Iterator interface
		 * 
		 * LIMITATION: 
		 * ----------- 
		 * 
		 * 1) Using Enumeration and Iterator we can only move in
		 * FORWARD direction and we can't move BACKWARD direction
		 * 
		 * 2) This are called SIGLE direction cursors
		 * 
		 * 3) Using Iterator we can perform only read and remove operation but we can't
		 * perform Replacement and addition of new object
		 * 
		 * 4) To overcome above problem we should go for ListIterator
		 * 
		 */

		List<Integer> list = new ArrayList<Integer>();

		Collections.addAll(list, 21, 12, 24, 15, 34, 19);

		System.out.println("Current list is: " + list);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			int value = itr.next();
			if (value % 2 == 0) {
				System.out.println("Even elements are: " + value);
			} else {
				itr.remove();
				System.out.println("Removed elements are: " + value);
			}
		}

		System.out.println("Altered list is: " + list);
	}

}
