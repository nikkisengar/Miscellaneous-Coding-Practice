package com.java.thread_yield_method;

/*
 * yield() method of Thread class will pause the current executing thread to 
 * give chance for the other waiting threads of same priority or higher.
 * suppose if there are no thread waiting or all the waiting threads have low priority 
 * then the current executing thread, the current executing thread can continue its execution.
 * 
 * NOTE: yield() method is not implemented in Java, it came from the native languages
 * 
 * yield() method make a thread to return to runnable state
 * 
 * yield() method prototype: public static native void yield()
 * 
 */
class MT extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread...");
			Thread.yield();
		}
	}
}

public class ThreadYieldDemo {

	public static void main(String[] args) {

		// Thread.currentThread().setPriority(7);

		MT t = new MT();

		t.setPriority(7);

		t.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread...");
		}
	}
}
