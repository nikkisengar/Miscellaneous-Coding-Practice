package com.java.primitive_type_functional_interface;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionInterfaceToFindSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntToDoubleFunction f=i->Math.sqrt(i);
		System.out.println(f.applyAsDouble(48));
	}

}
