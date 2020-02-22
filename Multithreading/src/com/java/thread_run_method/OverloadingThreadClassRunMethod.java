package com.java.thread_run_method;

class OverloadRunMethod extends Thread{
	public void run() {
		System.out.println("no-arg run() method");
	}
	
	public void run(int i) {
		System.out.println("int-arg run() method"+i);
	}
}

public class OverloadingThreadClassRunMethod {

	public static void main(String[] args) {
		OverloadRunMethod t=new OverloadRunMethod();
		t.start();
		
		System.out.println("string-arg main() method");
		t.run(5);
		
	

	}

}
