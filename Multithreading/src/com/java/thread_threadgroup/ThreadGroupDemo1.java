package com.java.thread_threadgroup;

public class ThreadGroupDemo1 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());//main
		
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());//system

	}

}
