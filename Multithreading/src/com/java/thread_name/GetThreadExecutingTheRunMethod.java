package com.java.thread_name;

class ThreadGetName extends Thread{
	public void run() {
		System.out.println("run() method executed by thread: "+Thread.currentThread().getName());
	}
}


public class GetThreadExecutingTheRunMethod {

	public static void main(String[] args) {
		
		System.out.println("main() method executed by thread: "+Thread.currentThread().getName());
		
		ThreadGetName t=new ThreadGetName();
		
		t.start();

	}

}
