package com.java.consumer;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		
		Consumer<String> c=s->System.out.println(s);
		c.accept("Hello");
		c.accept("Nikhil");

	}

}
