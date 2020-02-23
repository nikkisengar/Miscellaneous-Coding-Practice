package com.java.thread_synchronized_block;

class DisplayClassLock{
	
	public void wish(String name) {
		;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;//contains 1 lakh lines
	
		synchronized (DisplayClassLock.class) {

			for (int i = 0; i < 4; i++) {
				System.out.print("Good Morning: ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
				System.out.println(name);
			}
		}
		;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;//contains 1 lakh lines
	}
}

class MyThreadBlockClassLock extends Thread{
	DisplayClassLock d;
	String name;
	
	public MyThreadBlockClassLock(DisplayClassLock d, String name) {
		
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.wish(name);
	}
}

public class ThreadClassLevelLockInSynchronizedBlock {

	public static void main(String[] args) {
		
		DisplayClassLock d=new DisplayClassLock();
		
		MyThreadBlockClassLock t1=new MyThreadBlockClassLock(d, "Dhoni");
		MyThreadBlockClassLock t2=new MyThreadBlockClassLock(d, "Yuvi");
		
		t1.start();
		t2.start();

	}

}
