package com.java.tread_interrupt_method;


/*
 * A thread can interrupt a sleeping or a waiting thread by using interrupt() method of the thread class
 * 
 * syntax: public void interrupt()
 *   
 */

class MyInterrupted extends Thread{
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("I am lazy thread-"+i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("I got Interrupted");
		}
	}
}

public class ThreadInterruptDemo {

	public static void main(String[] args) {
		
		MyInterrupted t=new MyInterrupted();
		t.start();
		t.interrupt();
		System.out.println("End of main thread");
	}
}
