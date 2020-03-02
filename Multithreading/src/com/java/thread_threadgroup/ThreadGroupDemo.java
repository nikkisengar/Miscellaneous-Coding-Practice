package com.java.thread_threadgroup;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		
		ThreadGroup g=new ThreadGroup("First Group");
		
		System.out.println(g.getParent().getName());//main
		
		ThreadGroup g1=new ThreadGroup(g,"Second group");
		System.out.println(g1.getParent().getName());//First Group
		

	}

}
