package com.java.thread_implemention;

class ExtendingThread extends Thread{
	public void run() {
		for(int i=0;i<8;i++)
			System.out.println("Child Thread");
	}
	
	public void run(int i) {
		System.out.println(i);
	}
}

public class ThreadImplementationByExtendingThreadClass {

	public static void main(String[] args) {
		
		ExtendingThread t=new ExtendingThread();
		
		t.start();
		t.run(10);
		for(int i=0;i<8;i++) {
			System.out.println("Main Thread");
		}

	}
	
	public static void main() {
		System.out.println("no-arg main() method");
	}

}
