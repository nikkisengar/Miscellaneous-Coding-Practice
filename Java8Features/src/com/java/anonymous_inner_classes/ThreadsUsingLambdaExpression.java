package com.java.anonymous_inner_classes;

public class ThreadsUsingLambdaExpression {

	public static void main(String[] args) {
		
		//Replacing Anonymous Inner class with Lambda Expression
		Runnable r=()->{
			for(int i=0;i<5;i++) {
				System.out.println("Child Thread: "+i);
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread: "+i);
		}
		
	}

}
