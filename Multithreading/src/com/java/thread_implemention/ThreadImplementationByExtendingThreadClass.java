package com.java.thread_implemention;

class ExtendingThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("Child Thread");
	}
}

public class ThreadImplementationByExtendingThreadClass {

	public static void main(String[] args) {
		
		ExtendingThread t=new ExtendingThread();
		
		t.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}

	}

}
