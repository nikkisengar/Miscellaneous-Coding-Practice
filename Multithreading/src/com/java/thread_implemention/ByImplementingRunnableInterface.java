package com.java.thread_implemention;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<6;i++)
			System.out.println("Child Runnable Thread");
		
	}
}

public class ByImplementingRunnableInterface {

	public static void main(String[] args) {
		
		MyRunnable r=new MyRunnable();
		
		Thread t=new Thread(r);
		
		t.start();
		
		for(int i=0;i<6;i++)
			System.out.println("Main Runnable Thread");

	}

}
