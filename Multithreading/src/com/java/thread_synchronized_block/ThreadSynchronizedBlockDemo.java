package com.java.thread_synchronized_block;

class DisplayBlock{
	public void wish(String name) {
		System.out.println(Thread.currentThread().getName()+" said hii..");;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;//suppose 1 lakh lines of code
		int x=10;
		System.out.println("Current Value of x: "+x);
		synchronized (DisplayBlock.class) {
			for (int i = 0; i < 4; i++) {
				System.out.print("Good Morning:");

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
				System.out.println(name);
			}
		}
		
		System.out.println("Changed value of x: "+(++x));
		
		System.out.println(Thread.currentThread().getName()+" said bye..");;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;//suppose 1 lakh lines of code
	}
}

class MyThreadSynchronizedBlock extends Thread{
	DisplayBlock d;
	String name;
	
	public MyThreadSynchronizedBlock(DisplayBlock d,String name) {

		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.wish(name);
	}
}

public class ThreadSynchronizedBlockDemo {

	public static void main(String[] args) {
		
		DisplayBlock d=new DisplayBlock();
		DisplayBlock d1=new DisplayBlock();
		MyThreadSynchronizedBlock t1=new MyThreadSynchronizedBlock(d, "Dhoni");
		MyThreadSynchronizedBlock t2=new MyThreadSynchronizedBlock(d1, "Yuvi");
		
		t1.start();
		t2.start();

	}

}
