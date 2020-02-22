package com.java.thread_sleep_method;

public class ThreadSleepSlideShow {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=1;i<=10;i++) {
			System.out.println("Slide-"+i);
			Thread.sleep(3000);
		}

	}

}
