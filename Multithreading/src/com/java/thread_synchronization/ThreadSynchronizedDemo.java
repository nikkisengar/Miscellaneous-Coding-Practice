package com.java.thread_synchronization;

class DisplayResult{
	
	public synchronized void displayN() {
		System.out.println("displayN-"+Thread.currentThread().getName());
		for(int i=1;i<=10;i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	
	public synchronized void displayC() {
		System.out.println("displayC-"+Thread.currentThread().getName());
		for (int i = 65; i <= 75; i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

class MyThread1 extends Thread{
	DisplayResult d;

	public MyThread1(DisplayResult d) {
		System.out.println("MyThread1-"+Thread.currentThread().getName());
		this.d=d;
	}
	
	public void run() {
		System.out.println("MyThread1-"+Thread.currentThread().getName());
		d.displayN();
	}
}

class MyThread2 extends Thread{
	DisplayResult d;
	
	public MyThread2(DisplayResult d) {
		System.out.println("MyThread2-"+Thread.currentThread().getName());
		this.d=d;
	}
	
	public void run() {
		
		System.out.println("MyThread2-"+Thread.currentThread().getName());
		d.displayC();
	}
}

public class ThreadSynchronizedDemo {

	public static void main(String[] args) {
		System.out.println("main-"+Thread.currentThread().getName());
		
		DisplayResult d=new DisplayResult();
		
		MyThread1 t1=new MyThread1(d);
		MyThread2 t2=new MyThread2(d);
		
		t1.start();
		t2.start();

	}

}
