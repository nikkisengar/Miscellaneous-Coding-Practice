package com.java.inter_thread_communication;

class MyThreadA extends Thread {
	int total = 0;

	public void run() {

		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+" thread starts calculation.");
			
			for (int i = 1; i <= 100; i++) {
				total = total + i;
			}
			System.out.println(Thread.currentThread().getName()+" thread trying to give notification.");
			this.notify();
		}
	}
}

public class InterThreadCommunicationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyThreadA a=new MyThreadA();
		
		a.start();
		
		synchronized (a) {
			System.out.println(Thread.currentThread().getName()+" thread trying to call wait() method.");
			
			a.wait();
			
			System.out.println(Thread.currentThread().getName()+" thread received notification.");
			
			System.out.println("Value of total: "+a.total);
		}

	}

}
