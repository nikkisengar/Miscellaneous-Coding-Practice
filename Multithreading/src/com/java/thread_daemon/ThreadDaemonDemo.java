package com.java.thread_daemon;

class MyDaemonThread extends Thread{
	
}

public class ThreadDaemonDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+" thread isDaemon: "+Thread.currentThread().isDaemon());
		try {
			Thread.currentThread().setDaemon(true);
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" thread can't be set as Daemon...");
		}
		
		
		MyDaemonThread t=new MyDaemonThread();
		
		System.out.println(t.getName()+" thread isDaemon: "+t.isDaemon());
		
		t.setDaemon(true);
		System.out.println("After change: \n"+t.getName()+" thread isDaemon: "+t.isDaemon());
		

	}

}
