package com.java.thread_suspend;

class MySuspend extends Thread{

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()+" thread");
			Thread.currentThread().resume();
		}
	}
}

public class ThreadSuspendDemo {

	public static void main(String[] args) {
		
		MySuspend s =new MySuspend();
		s.start();
		s.suspend();
		System.out.println("End of "+Thread.currentThread().getName()+" thread");
		

	}

}
