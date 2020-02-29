package com.java.thread_volatile_keyword;

class VolatileData{
	private volatile boolean flag=true;
	
	public boolean isFlag() {
		return flag;
	}
	
	public void changeFlag() {
		flag=false;
	}
}

class MyVolatile implements Runnable{

	private VolatileData data;
	
	public MyVolatile(VolatileData data) {
		this.data=data;
	}
	
	@Override
	public void run() {
		
		while(data.isFlag()) {
			System.out.println("Inside run() method");
		}	
	}
}

class MyVolatile1 implements Runnable{

	private VolatileData data;
	
	public MyVolatile1(VolatileData data) {
		this.data=data;
	}
	
	@Override
	public void run() {
		data.changeFlag();
	}
}

public class ThreadVolatileKeywordDemo {

	public static void main(String[] args) throws InterruptedException{
		
		VolatileData data=new VolatileData();
		
		MyVolatile v=new MyVolatile(data);
		MyVolatile1 v1=new MyVolatile1(data);
		Thread t=new Thread(v);
		Thread t1=new Thread(v1);
		
		t.start();
		t1.start();
		
		//Thread.sleep(2000);

	}

}
