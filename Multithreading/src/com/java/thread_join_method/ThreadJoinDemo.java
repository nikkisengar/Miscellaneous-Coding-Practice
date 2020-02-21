package com.java.thread_join_method;

class MyJoin extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Seta Thread...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
				System.out.println("Don't sleep too much...");
			}
		}
	}
}

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyJoin t=new MyJoin();
		
		t.start();
		t.join(1000);
		
		for(int i=0;i<5;i++) {
			System.out.println("Rama Thread...");
		}

	}

}
