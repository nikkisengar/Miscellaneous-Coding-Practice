package com.java.thread_restart;

class RestartThread extends Thread{
	public void run() {
		System.out.println("run() method");
	}
}

public class RestartingThread {

	public static void main(String[] args) {
		
		RestartThread t=new RestartThread();
		t.start();
		
		System.out.println("main thread");
		
		//restarting a thread will throw IllegalThreadStateException 
		//t.start();
		

	}

}
