package com.java.thread_priority;

class MyThread extends Thread{
	public void run() {
		
		//default priority for the child thread will be inherited from parent to child
		System.out.println("Child default priority: "+Thread.currentThread().getPriority());
		for(int i=0;i<3;i++)
			System.out.println("child Thread...");
	}
}

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		
		SecurityManager security = System.getSecurityManager();
		System.out.println(security);
		
		System.out.println("System cores: "+Runtime.getRuntime().availableProcessors());
		
		System.out.println("Min_Priority: "+Thread.MIN_PRIORITY);
		System.out.println("Norm_Priority: "+Thread.NORM_PRIORITY);
		System.out.println("Max_Priority: "+Thread.MAX_PRIORITY);
		
		
		System.out.println("main Thread priority: "+Thread.currentThread().getPriority()+"\n");
		
		//changing the default priority for the main thread
		Thread.currentThread().setPriority(7);
		MyThread t=new MyThread();
		System.out.println("Default priority of t: "+t.getPriority());
		
		t.setPriority(10);
		
		//We should not exceed the allowed values range which is 1 to 10 otherwise we will get IllegalArgumentException 
		//t.setPriority(18);
		
		t.start();
		
		for(int i=0;i<3;i++)
			System.out.println("main Thread...");
	}
}
