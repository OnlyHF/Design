package com.design.flyweight.demo;

public class CreateFlyweight implements Flyweight {

	private String innerState;
	
	public CreateFlyweight(String innerState) {
		this.innerState = innerState;
	}
	
	public void operation(String state) {
		System.out.println("innerState = " + innerState + " ---> state = " + state);
	}

}
