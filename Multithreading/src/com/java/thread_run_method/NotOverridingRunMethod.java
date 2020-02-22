package com.java.thread_run_method;

class NotOverridingRun extends Thread{
	//It is highly recommended to override run() method, otherwise don't go for multi-threading concept 
}

public class NotOverridingRunMethod {

	public static void main(String[] args) {
		
		NotOverridingRun t=new NotOverridingRun();
		t.start();
		
		//System.out.println("main thread");

	}

}
