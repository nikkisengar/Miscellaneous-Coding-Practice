package com.java.bi_functional_interfaces;

import java.util.function.BiConsumer;

public class BiConsumerToPrintConcatenationOfTwoStrings {

	public static void main(String[] args) {

		BiConsumer<String, String> c=(s1,s2)->System.out.println(s1+s2);
		c.accept("Durga", "soft");
	}
}
