package com.java.thread_callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CallableDemo implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {

		int total = 0;

		for (int j = 1; j <= 100; j++) {
			total = total + j;
		}
		return total;
	}
}

public class ThreadCallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service=Executors.newFixedThreadPool(10);
		
		CallableDemo c=new CallableDemo();
		
		service.submit(c).get();
		System.out.println(service.submit(c).get());
	}

}
