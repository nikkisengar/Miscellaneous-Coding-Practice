package com.java.thread_threadgroup;

class ThreadGroupRunnable implements Runnable {
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "\t" + "i= " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("I Got Interrupted by the Thread: "+Thread.currentThread().getName()+" of ThreadGroup: "+Thread.currentThread().getThreadGroup().getName());
			}
		}
	}
}

public class ThreadGroupDemo2 {

	public static void main(String[] args) {

		ThreadGroupRunnable r = new ThreadGroupRunnable();

		// creating two thread group
		ThreadGroup tg1 = new ThreadGroup("GroupA");
		ThreadGroup tg2 = new ThreadGroup(tg1,"GroupB");

		// creating threads belongs to GroupA
		Thread t1 = new Thread(tg1, r, "T1");
		Thread t2 = new Thread(tg1, r, "T2");
		Thread t3 = new Thread(tg1, r, "T3");
		Thread t4 = new Thread(tg1, r, "T4");

		// creating threads belongs to GroupB
		Thread t5 = new Thread(tg2, r, "T5");
		Thread t6 = new Thread(tg2, r, "T6");

		// starting the threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

		// performing common task on ThreadGroup
		System.out.println("GroupA active count: " + tg1.activeCount());
		tg2.setDaemon(true);
		
		//Interrupting ThreadGroup GroupA  
		tg1.interrupt();
		System.out.println("GroupB isDeamon: " + tg2.isDaemon());
		tg2.setMaxPriority(8);
		System.out.println("GroupB MaxPriority: " + tg2.getMaxPriority());
		System.out.println("tg1 Name: " + tg1.getName());
		System.out.println("tg2 Name: " + tg2.getName());

		System.out.println("tg1 ParentGroup Name: " + tg1.getParent().getName());
		
		//main thread's ThreadGroup
		System.out.println(
				"main thread ParentGroup Name: " + Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println("main thread Group Name: " + Thread.currentThread().getThreadGroup().getName());
		
		

	}
}
