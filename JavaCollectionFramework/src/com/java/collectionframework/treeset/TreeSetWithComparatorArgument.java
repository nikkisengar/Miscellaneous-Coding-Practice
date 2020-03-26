package com.java.collectionframework.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComparatorArgument {

	public static void main(String[] args) {

		// Using MyComparator as argument to TreeSet to get the customized sorting order
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());

		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);

		System.out.println("TreeSet: " + t);
	}

}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer I1, Integer I2) {
		/*
		 * Case 1: if (I1 < I2) { return +1000; } else if (I1 > I2) { return -90; } else
		 * return 0;
		 */

		// case 2:
		// return I1.compareTo(I2);// Ascending order

		// case 3:
		// return -I1.compareTo(I2);// Descending order

		// case 4:
		// return I2.compareTo(I1);// Descending order

		// case 5:
		// return -I2.compareTo(I1);// Ascending order

		// case 6:
		// return 1; // Insertion order

		// case 7:
		// return -1; // reverse of Insertion order

		// case 8:
		return 0;// Only first element will be inserted and rest will be considered as duplicate
					// even if they are not duplicate

	}

}
