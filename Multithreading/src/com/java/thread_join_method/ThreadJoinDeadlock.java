package com.java.thread_join_method;

public class ThreadJoinDeadlock {

	public static void main(String[] args) throws InterruptedException{
		
		Thread.currentThread().join();
		System.out.println("Deadlock");
	}
}
