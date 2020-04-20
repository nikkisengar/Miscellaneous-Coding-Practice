package com.java.collection_interface_common_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionInterfaceCommonMethods {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(102);
		list1.add(104);
		System.out.println("add() returns: " + list1.add(106));

		System.out.println("list1: " + list1);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(101);
		list2.add(103);
		list2.add(105);
		System.out.println("is list1 added to list2 (addAll() returns): " + list2.addAll(list1));

		System.out.println("list2: " + list2);

		// remove(Object o)
		list2.remove(new Integer(101));
		System.out.println("list2 after remove(Object): " + list2);

		// removeAll(Collection c)
		list2.removeAll(list1);
		System.out.println("list2 after removeAll(Collection): " + list2);

		// retainAll(Collection c)
		list2.addAll(list1);
		list2.retainAll(list1);
		System.out.println("list2 after retainAll(Collection):" + list2);

		// clear()
		list2.clear();
		System.out.println("list2 after clear(): " + list2);

		// contains(Object o)
		list2.add(101);
		list2.add(102);
		list2.add(103);
		list2.add(105);
		list2.addAll(list1);
		System.out.println("list2 contains the element 102: " + list2.contains(102));

		// containsAll(Collection c)
		System.out.println("list2 containsAll elements in list1: " + list2.containsAll(list1));

		// isEmpty();
		list1.clear();
		System.out.println("is list1 empty: " + list1.isEmpty());

		// size()
		System.out.println("list1 size: " + list1.size());
		System.out.println("list2 size: " + list2.size());

		// toArray();
		Object[] arr = list2.toArray();
		System.out.println("Array using lis2: " + Arrays.toString(arr));

		// iterator()
		Iterator<Integer> itr = list2.iterator();
		System.out.println("list2 elements one by one: ");
		list1.add(101);
		System.out.println("list1: " + list1);
		list2.add(107);
		while (itr.hasNext()) {
			Integer I = itr.next();
			System.out.println(I);
		}

	}

}
