package com.java.thread_join_method;


/* 
 * join() method of Thread class is used when a thread t1 wants to wait for a thread t2 until its completion.
 * Please note that join() method throws InterruptedException.
 * 
 * When we call join() method on the thread it will go from running to waiting state
 * 
 * It will goto runnable from waiting state if thread completed, or if time expires, or if waiting thread got interrupted. 
 * 
 */

//waiting of main thread until the completion of child thread 
class MyJoin extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Seta Thread...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
				System.out.println("Don't sleep too much...");
			}
		}
	}
}

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyJoin t=new MyJoin();
		
		t.start();
		t.join(1000);
		
		for(int i=0;i<5;i++) {
			System.out.println("Rama Thread...");
		}

	}

}
