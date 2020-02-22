package com.java.runnable_case_study;

class MyRunnableCaseStudy implements Runnable{

	@Override
	public void run() {
		System.out.println("run() method");
	}
}

public class RunnableCaseStudy {

	public static void main(String[] args) {
		
		MyRunnableCaseStudy r=new MyRunnableCaseStudy();
		Thread t=new Thread();
		Thread t1=new Thread(r);
		
		/*
		 * it will start a new thread, run() method of Thread class will be executed
		 * which is an empty implementation and will be executed as a normal method
		 */
		t.start();
		/*
		 * t.run() will not start any thread, run() method of Thread class will be
		 * executed which is an empty implementation and will be executed as a normal
		 * method
		 */
		t.run();
		
		//t1.start() will start a thread and call run() method of MyRunnableCaseStudy class
		t1.start();
		/*
		 * t1.run() will not start any thread, run() method of MyRunnableCaseStudy class
		 * will be executed and will be executed as a normal method.
		 */
		t1.run();
		
		//CE: cannot find symbol
		//r.start();
		
		/*
		 * r.run() will not start a thread, run() method of MyRunnableCaseStudy class
		 * will be executed and will be executed as a normal method.
		 */ 
		r.run();
		
		System.out.println("End of main thread");
	}

}
