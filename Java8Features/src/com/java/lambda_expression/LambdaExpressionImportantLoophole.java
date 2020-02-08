package com.java.lambda_expression;

interface Interf3{
	public void m1();
}

public class LambdaExpressionImportantLoophole {

	//instance variable
	int x=10;
	
	public void m2() {
		
		//local variable
		int y=20;
		
		Interf3 i=()->{
			System.out.println("Initial Value of class variable x: "+x);
			System.out.println("Initial Value of local variable y: "+y);
			
			x=888;
			//y=999;//CE: Local variable y defined in an enclosing scope must be final or effectively final
			
			System.out.println("Changed value of class variable x: "+x);
			//System.out.println("Changed value of local variable y: "+y);
		};
		
		i.m1();
	}
	
	public static void main(String[] args) {
		
		LambdaExpressionImportantLoophole l=new LambdaExpressionImportantLoophole();
		l.m2();
	}
}
