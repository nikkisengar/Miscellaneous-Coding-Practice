package com.java.thread_synchronization;

class Disp {
	public synchronized void wish(String name) {

		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning:");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}

			System.out.println(name);
		}
	}
}

class MyThreadDisp extends Thread {
	Disp d;
	String name;

	public MyThreadDisp(Disp d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class ThreadSynchronizationDemoUsingTwoObject {

	public static void main(String[] args) {

		/*
		 * Here even though we have used two Disp object and trying to execute the
		 * thread on wish(-) method which is synchronized will give mixed output
		 */
		Disp d = new Disp();
		Disp d1 = new Disp();

		MyThreadDisp t1 = new MyThreadDisp(d, "Dhoni");

		MyThreadDisp t2 = new MyThreadDisp(d1, "Yuvraj");

		t1.start();
		t2.start();
	}

}
