package com.java.anonymous_inner_classes;

interface Interf2{
	public void m1();
}

public class ThisKeywordInsideLambdaExpression {

	//instance variable
	int x=888;
	
	public void m2() {
		Interf2 i = ()->{
			//local variable
			int x=999;
			
			System.out.println("Value of outer class x: "+this.x);//888 as this inside lambda expression will points to current outer class object 
			System.out.println("Value of lambda expression x: "+x);//999
		};
		
		i.m1();
	}
	
	public static void main(String[] args) {

		ThisKeywordInsideLambdaExpression test=new ThisKeywordInsideLambdaExpression();
		test.m2();

	}

}
