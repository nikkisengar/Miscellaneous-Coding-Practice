package com.java.method_reference;

public class ThreadDemoUsingMethodReference {

	public void m1() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Child Thread...");
		}
	}
	
	public static void main(String[] args) {
		
		ThreadDemoUsingMethodReference threadDemo=new ThreadDemoUsingMethodReference();
		
		Runnable r=threadDemo::m1;
		
		Thread t=new Thread(r);
		t.start();
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Main Thread...");
		}

	}

}
