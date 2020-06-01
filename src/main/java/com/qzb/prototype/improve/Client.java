package com.qzb.prototype.improve;

public class Client {
	
	public static void main(String[] args) {
		Sheep sheep = new Sheep("tom", 1, "白色");
		Sheep sheep2 = (Sheep)sheep.clone();
		
		System.out.println(sheep2);
		System.out.println(sheep.getName() == sheep2.getName());
		sheep.setName("张三");
		
		System.out.println(sheep2.getName());
		System.out.println(sheep.getName());
		System.out.println(sheep.getName() == sheep2.getName());
		
		sheep.a[0] = 10;
		System.out.println(sheep2.a[0]);
		
	}
	

}
