package com.java.thread_synchronization;

class Display{
	public void wish(String name) {
		for(int i=0;i<4;i++) {
			System.out.print("Good Morning:");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
			System.out.println(name);
		}
	}
}

class MySynchroziedThread extends Thread{
	
	Display d;
	String name;
	
	public MySynchroziedThread(Display d, String name) {
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.wish(name);
	}
}

public class ThreadSynchronizationDemo {

	public static void main(String[] args) {
		
		Display d=new Display();
		MySynchroziedThread t=new MySynchroziedThread(d, "Dhoni");
		//Display d1=new Display();
		MySynchroziedThread t1=new MySynchroziedThread(d, "Yuvraj");

		t.start();
		t1.start();
		
	}

}
