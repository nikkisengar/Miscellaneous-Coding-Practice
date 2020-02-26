package com.java.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{

	String name;
	
	public PrintJob(String name) {
		
		this.name=name;
	}
	
	@Override
	public void run() {
		
		System.out.println(name+"...job is started by the thread: "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		System.out.println(name+"...job is completed by the thread: "+Thread.currentThread().getName());
		
	}	
}

//Thread pool is also know as Executor framework
public class ThreadPoolDemo {

	public static void main(String[] args) {
		
		PrintJob[] jobs= {new PrintJob("Durga"),
				new PrintJob("Ravi"),
				new PrintJob("Suresh"),
				new PrintJob("Gouse"),
				new PrintJob("Pawan"),
				new PrintJob("Shiva")};
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		
		for(PrintJob job:jobs) {
			//ExecutorService will create a thread and will start a thread for every job
			service.submit(job);
		}
		
		//After using the ExecutorService shut down the thread pool.
		service.shutdown();

	}

}
