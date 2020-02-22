package com.java.thread_join_method;


//Waiting of child thread until completion of main thread.
class MyJoinDemo extends Thread {

	static Thread mt;

	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			System.out.println("Waiting for main Thread to complete...");
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread...");
		}
	}
}

public class ThreadJoinDemo1 {

	public static void main(String[] args) throws InterruptedException {

		MyJoinDemo.mt = Thread.currentThread();

		MyJoinDemo t = new MyJoinDemo();

		t.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread...");
			Thread.sleep(2000);
		}
	}
}
