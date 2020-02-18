package com.java.thread_priority;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<3;i++)
			System.out.println("child Thread...");
	}
}

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		
		System.out.println("main Thread priority: "+Thread.currentThread().getPriority()+"\n");
		
		MyThread t=new MyThread();
		
		t.setPriority(7);
		
		t.start();
		
		for(int i=0;i<3;i++)
			System.out.println("main Thread...");
	}
}
