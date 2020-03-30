package com.java.collectionframework.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
}

public class PriorityQueueForCustomizedSortingOrder {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>(15, new MyComparator());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");

		System.out.println("PriorityQueue for customized sorting order: " + q);
	}
}
