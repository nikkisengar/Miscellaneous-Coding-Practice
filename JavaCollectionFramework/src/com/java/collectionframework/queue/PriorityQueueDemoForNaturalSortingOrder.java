package com.java.collectionframework.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemoForNaturalSortingOrder {

	public static void main(String[] args) {

		PriorityQueue<Integer> q = new PriorityQueue<Integer>();

		System.out.println("calling peek() method for empty queue: " + q.peek());
		//System.out.println("calling element() method for empty queue: " + q.element());//java.util.NoSuchElementException

		for (int i = 0; i <= 10; i++) {
			q.offer(i);
		}

		System.out.println("Initial PriorityQueue: " + q);
		System.out.println("calling poll() method on the PriorityQueue: " + q.poll());
		System.out.println("Initial PriorityQueue: " + q);

	}

}
