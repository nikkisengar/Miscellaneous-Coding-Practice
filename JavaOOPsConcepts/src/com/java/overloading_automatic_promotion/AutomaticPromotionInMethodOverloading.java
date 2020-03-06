package com.java.overloading_automatic_promotion;

public class AutomaticPromotionInMethodOverloading {

	public void m1(int i) {
		System.out.println("int-arg");
	}
	
	public void m1(float f) {
		System.out.println("float-arg");
	}
	
	public static void main(String[] args) {
	
		AutomaticPromotionInMethodOverloading method=new AutomaticPromotionInMethodOverloading();
		
		method.m1(10);
		method.m1(10.5f);
		method.m1('a');//can't find the m1(char) method so automatically promoted to m1(int)
		method.m1(10l);//can't find the m1(long) method so automatically promoted to m1(float)
		//method.m1(10.5);//Compile time error as m1(double) is not present

	}
}
