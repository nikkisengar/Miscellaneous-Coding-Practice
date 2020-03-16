package com.java.thread_threadgroup;

public class SystemGroupActiveThreads {

	public static void main(String[] args) {

		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		
		Thread[] threadList = new Thread[system.activeCount()];
		
		system.enumerate(threadList);
		
		for(Thread t:threadList) {
			System.out.println(t.getName()+"----"+t.isDaemon());
		}
		
		/*
		 * Output:
		 * -------
		 * Reference Handler----true 
		 * Finalizer----true 
		 * Signal Dispatcher----true 
		 * Attach Listener----true 
		 * main----false
		 * 
		 */
		
		

	}

}
