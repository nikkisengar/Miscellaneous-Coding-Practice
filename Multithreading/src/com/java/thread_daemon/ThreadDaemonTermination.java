package com.java.thread_daemon;

/*
 * Whenever the last non-daemon threads terminate,
 * automatically all daemon threads will be terminated
 * irrespective of there position
 * 
 */

class MyDaemon extends Thread{
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println(Thread.currentThread().getName()+" thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+" thread is in sleeping state...");
			}
		}
	}
}

public class ThreadDaemonTermination {

	public static void main(String[] args) {
		
		MyDaemon d=new MyDaemon();
		
		d.setDaemon(true);
		
		d.start();
		
		System.out.println("End of "+Thread.currentThread().getName()+" thread");

	}

}
