package com.java.collectionframework;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CollectionsClassDemo {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		// 1) addAll()
		Collections.addAll(fruits, "Banana", "Grapes", "Apple", "Orange", "Pineapple");

		// If we want to print in our own way then we can use the double colon operator
		// came in Java 8
		System.out.println("Before Sort: ");
		// usage of Java 8
		fruits.forEach(System.out::println); // System.out.println("Before Sort: "+fruits);

		// 2) sort(-)
		Collections.sort(fruits);

		System.out.println("After Sort: " + fruits);

		// 3) sort(-,-)
		Collections.sort(fruits, Collections.reverseOrder());
		// or Collections.reverse(fruits);
		System.out.println("Reverse order: " + fruits);

		// 4) asLifoQueue(Deque deque)
		Deque<String> deque = new LinkedList<String>();
		deque.addFirst("Apple");
		deque.addLast("Banana");
		deque.add("Orange");

		System.out.println("Deque: " + deque);

		Queue<String> queue = Collections.asLifoQueue(deque);
		System.out.println("View of the Deque: " + queue);
		/*
		 * System.out.println(queue.poll()); System.out.println(queue.poll());
		 * System.out.println(queue.poll());
		 */

		// 5) binarySearch(-,-) before using this method we must sort the list in
		// natural sorting order otherwise, the result will be undefined.
		List<String> names = new ArrayList<String>();
		Collections.addAll(names, "Rahul", "Kunal", "Amit", "Gouse", "Sanjay");

		// sorting in natural sorting order
		Collections.sort(names);

		// sorting in reverse order
		// Collections.sort(names, Collections.reverseOrder());

		System.out.println("Names in sorted order: " + names);

		System.out.println("Gouse is at index: " + Collections.binarySearch(names, "Gouse"));

		// 6) checkedCollection(-,-) --> This method provides the dynamically type-safe
		// view of the provided collection
		List numberList = new ArrayList();

		Collections.addAll(numberList, "One", "Two", "Three", "Four", "Five");

		Collection checkedList = Collections.checkedCollection(numberList, String.class);

		System.out.println("Content of checkedList: " + checkedList);

		// We can add any type of element to the numberList
		numberList.add(10);

		System.out.println("Updated numberList: " + numberList);

		// but if we are trying to add any type other then String in checkedList then we
		// will get exception
		// checkedList.add(10);

		System.out.println("Updated checkedList: " + checkedList);

		// 7) copy(-,-) --> This method copies all the elements from source list to
		// destination list

		Collections.copy(numberList, names);

		// using java 8 to print copyList
		numberList.forEach(System.out::println);

		// 8) disjoint(-,-) --> This method returns true if the two specified
		// collections have no elements in common
		System.out
				.println("Are their common elements  in numberList, names: " + Collections.disjoint(numberList, names));

		List<String> vegitables = new ArrayList<String>();
		Collections.addAll(vegitables, "Potato", "Tomato", "Bringle", "Cauliflower");

		System.out.println(
				"Are their common elements  in vegitables, fruits: " + Collections.disjoint(vegitables, fruits));

		System.out.println("Are their common elements  in vegitables, vegitables: "
				+ Collections.disjoint(vegitables, vegitables));

		System.out.println("Are their common elements  in new ArrayList<String>(), new ArrayList<String>(): "
				+ Collections.disjoint(new ArrayList<String>(), new ArrayList<String>()));

		// 9) fill(-,-) --> This method fill all the elements of the specified list with
		// the specified elements
		Collections.fill(names, null);

		System.out.println("Updated names: " + names);

		// 10) frequency(-,-) --> This method returns the no. of elements in the
		// specified collection which are equal to specified object
		System.out.println("frequency of null is: " + Collections.frequency(names, null) + " times");

		// 11) indexOfSubList(-,-) --> This method returns the starting position of the
		// first occurrence of the specified target list within the source
		List<String> fruitSubList = new ArrayList<String>();
		Collections.addAll(fruitSubList, "Orange", "Banana");
		System.out.println("First occurrence: " + Collections.indexOfSubList(fruits, fruitSubList));

		// 12) max(-,-) --> This method returns the maximum lenght element in the
		// collection according to natural sorting order
		System.out.println(Collections.max(fruits));

		// 13) synchronizedCollection(-) --> This method returns a synchronized
		// (thread-safe) collection for the specified collection
		Collection<String> synchronizedCollection = Collections.synchronizedCollection(fruits);

		// now this is a thread-safe collection
		System.out.println(synchronizedCollection);

	}

}
