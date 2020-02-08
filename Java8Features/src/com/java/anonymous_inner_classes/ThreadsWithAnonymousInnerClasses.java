package com.java.anonymous_inner_classes;

public class ThreadsWithAnonymousInnerClasses {

	public static void main(String[] args) {
		
		
		//Anonymous Inner class
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("Child Thread: "+i);
				}
			}
		}; 
		
		Thread t =new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread: "+i);
		}
	}
}
