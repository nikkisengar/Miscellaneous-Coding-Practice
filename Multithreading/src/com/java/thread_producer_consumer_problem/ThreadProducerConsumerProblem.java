package com.java.thread_producer_consumer_problem;

import java.util.LinkedList;

public class ThreadProducerConsumerProblem {

	public static void main(String[] args) {

		final PC pc = new PC();

		new Thread(() -> {
			try {
				pc.produce();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		},"Producer Thread").start();

		new Thread(() -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		},"Consumer Thread").start();
	}
}

class PC {

	// creating a list shared by producer and consumer
	// size of list=2
	LinkedList<Integer> list = new LinkedList<Integer>();
	int capacity = 2;

	// called by producer thread
	public void produce() throws InterruptedException {

		System.out.println("produce() method executed by "+Thread.currentThread().getName());
		
		int value = 0;
		
		while(true) {
			synchronized (this) {
				
				//producer thread waits when queue/list is full
				while(list.size()==capacity)
					wait();
				
				System.out.println("Producer produced-"+value);
				
				//to insert the job in the list
				list.add(value++);
				
				//notify the consumer thread that it can start consuming now
				notify();
				
				Thread.sleep(1000);
			}
		}
	}

	// called by consumer thread
	public void consume() throws InterruptedException {
		System.out.println("consume() method executed by "+Thread.currentThread().getName());
		
		while(true) {
			synchronized (this) {
				
				//consumer thread waits when queue/list is empty
				while(list.size()==0)
					wait();
				
				//to consume the item from the list we need to remove the first item from the list
				int val=list.removeFirst();
				
				System.out.println("Consumer consumed-"+val);
				
				//notify producer thread that the queue/list is now empty you can produce the item
				notify();
				
				Thread.sleep(1000);
			}
		}
	}
}
