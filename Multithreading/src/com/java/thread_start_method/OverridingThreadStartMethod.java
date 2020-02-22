package com.java.thread_start_method;

class OverridingStartMethod extends Thread{
	public void run() {
		super.run();
		System.out.println("run() method");
	}
	
	
	//It is not recommended to override the start() method, otherwise don't go for multi-threading concept
	public void start() {
		
		//using super.start() will call the Thread class start() method which internally calls the run() method
		super.start();
		System.out.println("start() method");
	}
}

public class OverridingThreadStartMethod {

	public static void main(String[] args) {
		
		OverridingStartMethod t=new OverridingStartMethod();
		t.start();
		
		System.out.println("main thread");

	}

}
