package com.java.anonymous_inner_classes;

interface Interf{
	public void m1();
}

public class ThisKeywordInsideAnonymousInnerClass {

	//instance variable
	int x=888;
	
	public void m2() {
		Interf i=new Interf() {

			//instance variable
			int x=999;
			
			@Override
			public void m1() {
				
				System.out.println("Value of anonymous inner class x: "+this.x);//999 as this inside anonymous inner class will points to inner class members
				System.out.println("Value of outer class x: "+ThisKeywordInsideAnonymousInnerClass.this.x);//888
			}
		};
		
		i.m1();
	}
	
	public static void main(String[] args) {
	
		ThisKeywordInsideAnonymousInnerClass test=new ThisKeywordInsideAnonymousInnerClass();
		test.m2();

	}

}
