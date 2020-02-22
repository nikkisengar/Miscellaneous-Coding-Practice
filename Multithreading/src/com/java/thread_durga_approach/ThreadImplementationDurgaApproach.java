package com.java.thread_durga_approach;

class DurgaApproach extends Thread{
	public void run() {
		System.out.println("run() method");
	}
}

public class ThreadImplementationDurgaApproach {

	public static void main(String[] args) {
		
		DurgaApproach t=new DurgaApproach();
		
		/*
		 * This will not give any error because t is of DurgaApproach type which is of
		 * Thread type and Thread class implements Runnable interface, thus t is
		 * indirectly of Runnable type.
		 */
		Thread t1=new Thread(t);
		
		t1.start();
		
		System.out.println("main thread");

	}

}
