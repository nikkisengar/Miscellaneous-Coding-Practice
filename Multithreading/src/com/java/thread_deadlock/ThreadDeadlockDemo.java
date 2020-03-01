package com.java.thread_deadlock;

class A {
	public synchronized void d1(B b) {
		System.out.println(Thread.currentThread().getName() + " started executing d1() method...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " calling B's class last() method...");
			b.last();
		}
	}

	public synchronized void last() {
		System.out.println(Thread.currentThread().getName() + " inside A's class last() method...");
	}
}

class B {

	public synchronized void d2(A a) {
		System.out.println(Thread.currentThread().getName() + " started executing d1() method...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " calling A's class last() method...");
			a.last();
		}
	}

	public synchronized void last() {
		
		System.out.println(Thread.currentThread().getName() + " inside B's class last() method...");

	}

}

public class ThreadDeadlockDemo extends Thread {

	A a=new A();
	B b=new B();
	
	public void m1() {
		this.start();
		a.d1(b);
	}
	
	public void run() {
		b.d2(a);
	}
	
	public static void main(String[] args) {
		
		ThreadDeadlockDemo deadlock=new ThreadDeadlockDemo();
		deadlock.m1();
	}

}
