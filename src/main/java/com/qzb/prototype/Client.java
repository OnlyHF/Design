package com.qzb.prototype;

public class Client {

	public static void main(String[] args) {
		Sheep sheep = new Sheep("tom", 1, "白色");
		
		Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		
		System.out.println(sheep);
		System.out.println(sheep2);
	}
}
