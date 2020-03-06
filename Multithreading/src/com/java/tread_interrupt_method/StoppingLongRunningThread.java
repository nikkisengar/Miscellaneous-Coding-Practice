package com.java.tread_interrupt_method;


/*
 * Why we are requesting thread to stop and why we can't shut it down because we don't know the state of the thread
 * 1) suppose if the thread is performing some data base operation and in the middle we don't want that thread to run
 *    if we shutdown the thread immediately then we can get the data inconsistency issue.
 * 2) Similarly, if the thread has opened a database connection and we shutdown the thread then the database connection 
 *    is never closed, which is the waste of a resource.
 * Thus, we are requesting the thread to stop but not forcing it to stop, if the thread don't want to stop then it can continue.
 * but if the thread agreed to stop then it will have the time to perform the clean up activities  
 */
class Task implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i < 10000; i++) {

			// performing long running operations
			System.out.println(i);

			// checking if the current executing thread got interrupted or not
			if (Thread.currentThread().isInterrupted()) {
				/*
				 * System.out.println("Stopping the thread..."); return;
				 */
				//if in case the thread does not want to stop then we have to change the interrupt flag to false.
				Thread.interrupted();
			}
		}

	}

}

public class StoppingLongRunningThread {

	public static void main(String[] args) throws InterruptedException {

		// start a thread
		Thread t1 = new Thread(new Task());
		t1.start();

		// after some time
		//Thread.sleep(2000);

		// changed my mind to stop the child thread
		//it will set the interrupt flag as true for the thread t1
		t1.interrupt();

		System.out.println("Requesting thread t1 to stop.");

	}

}
