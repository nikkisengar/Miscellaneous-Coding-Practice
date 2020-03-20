package com.java.collectionframework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		stack.push("A");
		stack.push("B");
		stack.push("C");

		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.search("C"));
		System.out.println(stack.pop());
		stack.push("Z");
		System.out.println(stack.search("Z"));

	}

}
