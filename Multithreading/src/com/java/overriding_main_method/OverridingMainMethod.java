package com.java.overriding_main_method;

class Super{
	   public static void main(String args[]) {
	      System.out.println("This is the main method of the superclass");
	   }
	}
	class Sub extends Super{
	   public static void main(String args[]) {
	      System.out.println("This is the main method of the subclass");
	   }
	}
	public class OverridingMainMethod{
	   public static void main(String args[]) {
		  // OverridingMainMethod obj = new OverridingMainMethod();
	      Super.main(args);
	      Sub.main(args);
	   }
	}