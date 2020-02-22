package com.java.tread_interrupt_method;

class InterruptLoophole extends Thread {

	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println("I am lazy thread-" + i);
		}
		System.out.println("I am entering into sleeping state.");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("I got Interrupted.");
		}
	}

}

public class ThreadInterruptLoophole {

	public static void main(String[] args) {

		InterruptLoophole t = new InterruptLoophole();
		t.start();
		
		/*
		 * If the target thread i.e InterruptLoophole will not enter sleeping or waiting
		 * state then the interrupt() call will be wasted
		 */ 
		t.interrupt();
		System.out.println("End of main thread");

	}
}
