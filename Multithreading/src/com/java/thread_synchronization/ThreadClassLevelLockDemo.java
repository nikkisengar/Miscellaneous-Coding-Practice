package com.java.thread_synchronization;

class ThreadClassLockDemo{
	
	public static synchronized void wish(String name) {
		
		for(int i=0;i<4;i++) {
			System.out.print("Good Morning: ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println(name);
		}
	}
	
	public static synchronized void sum(int i,int j) {
		System.out.println("Sum of i,j is: "+(i+j));
	}
	
	public static void minus(int i,int j) {
		System.out.println("minus of i,j: "+(i-j));
	}
	
	public synchronized void multi(int i, int j) {
		System.out.println("product of i: "+(i*j));
	}
	
	public void m5() {
		System.out.println("Hello world...");
	}
}

class MyThreadClassLock extends Thread{
	ThreadClassLockDemo c;
	String name;
	
	public MyThreadClassLock(ThreadClassLockDemo c,String name) {
		this.c=c;
		this.name=name;
	}
	
	public void run() {
		ThreadClassLockDemo.wish(name);
		ThreadClassLockDemo.sum(5, 4);
		ThreadClassLockDemo.minus(5, 4);
		c.m5();
		c.multi(5, 4);
	}
}

public class ThreadClassLevelLockDemo {

	public static void main(String[] args) {
		
		ThreadClassLockDemo c=new ThreadClassLockDemo();
		MyThreadClassLock t1=new MyThreadClassLock(c, "Dhoni");
		MyThreadClassLock t2=new MyThreadClassLock(c, "Yuvi");
		
		t1.start();
		t2.start();
	}
}
