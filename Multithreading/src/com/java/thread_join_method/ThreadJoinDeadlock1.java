package com.java.thread_join_method;

class MyJoinDemo1 extends Thread {

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

public class ThreadJoinDeadlock1 {

	public static void main(String[] args) throws InterruptedException {
		
		MyJoinDemo1.mt=Thread.currentThread();
		MyJoinDemo1 t = new MyJoinDemo1();

		t.start();

		
		/* Here we are using join() method on child thread and child thread is already using join() method on main thread.
		 * This is like child thread is waiting for main thread to complete 
		 * and main thread is waiting for the child thread to complete.
		 * This situation is called DeadLock
		 */
		t.join();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread...");
			Thread.sleep(2000);
		}

	}

}
