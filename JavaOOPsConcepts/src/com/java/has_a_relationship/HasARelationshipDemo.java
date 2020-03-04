package com.java.has_a_relationship;

class Engine{
	//starting an engine
	public void work() {
		System.out.println("Engine of  the car has been started.");
	}
}

final class Car{
	//for a car to move, it need to have an engine
	private Engine engine; //Composition
	//private Engine engine; //Aggregation
	
	public Car(Engine engine) {
		
		this.engine=engine;
	}
	
	public void move() {
		if(engine!=null) {
			engine.work();
			System.out.println("Car is moving.");
		}
	}
}

public class HasARelationshipDemo {

	public static void main(String[] args) {
		
		//making an engine by creating an instance of Engine class
		Engine engine=new Engine();
		
		//making a car with engine, so we are passing an engine instance as an argument while creating a car object
		Car car=new Car(engine);
		
		car.move();

	}

}
