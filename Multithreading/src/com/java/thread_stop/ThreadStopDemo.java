package com.java.thread_stop;


//stop() method is deprecated and it is not recommended to use. 
class MyStopThread extends Thread{
	
}

public class ThreadStopDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		MyStopThread t=new MyStopThread();
		t.start();
		System.out.println("End of "+Thread.currentThread().getName()+" thread");
		t.stop();

	}

}
