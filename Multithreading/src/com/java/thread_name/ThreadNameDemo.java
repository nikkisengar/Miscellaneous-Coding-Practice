package com.java.thread_name;

class MyThreadName extends Thread{
	
}

public class ThreadNameDemo {

	public static void main(String[] args) {

		/*
		 * To get the Current executing thread object we have to use
		 * Thread.currentThread() currentThread() is an static method in Thread class
		 * that is why we are calling the currentThread() method using the Thread class
		 * name.
		 */
		
		System.out.println("Current Executing Thread: "+Thread.currentThread().getName());
		
		MyThreadName t=new MyThreadName();
		
		System.out.println("MyThreadName class Thread name: "+t.getName());
		
		Thread.currentThread().setName("Nikhil");
		
		System.out.println("Current Thread Name changed to: "+Thread.currentThread().getName());
		
		//checking if the current thread name is changed or not
		System.out.println(10/0);
		

	}

}
