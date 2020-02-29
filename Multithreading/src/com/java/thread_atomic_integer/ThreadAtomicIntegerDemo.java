package com.java.thread_atomic_integer;

import java.util.concurrent.atomic.AtomicInteger;


/*
 * One way to resolve the Atomicity problem is that to use synchronized keyword
 * but using synchronization brings performance problem
 */
class AtomicIntegerValue {
	private int value = 1;
	
	AtomicInteger atomicInteger=new AtomicInteger(100);

	/*
	 * public int getValue() { return atomicInteger.get(); }
	 */

	public void changeValue() {
		System.out.println(atomicInteger.addAndGet(value));
	}
}

class MyAtomicInteger1 implements Runnable {

	private AtomicIntegerValue atomicInteger;

	public MyAtomicInteger1(AtomicIntegerValue atomicInteger) {
		this.atomicInteger = atomicInteger;
	}

	@Override
	public void run() {
		for (int i = 1; i <=3; i++) {
			//System.out.println(atomicInteger.getValue());
			atomicInteger.changeValue();
		}
	}
}

class MyAtomicInteger implements Runnable {

	private AtomicIntegerValue atomicInteger;

	public MyAtomicInteger(AtomicIntegerValue atomicInteger) {
		this.atomicInteger=atomicInteger;
	}

	@Override
	public void run() {
		for (int i = 1; i <=3; i++) {
			//System.out.println(atomicInteger.getValue());
			atomicInteger.changeValue();
		}
	}
}

public class ThreadAtomicIntegerDemo {

	public static void main(String[] args) {
		
		AtomicIntegerValue atomicInteger=new AtomicIntegerValue();
		
		MyAtomicInteger a =new MyAtomicInteger(atomicInteger);
		MyAtomicInteger1 a1=new MyAtomicInteger1(atomicInteger);
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(a1);
		
		t1.start();
		t2.start();
	}
}
