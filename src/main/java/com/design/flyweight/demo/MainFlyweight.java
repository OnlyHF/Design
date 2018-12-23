package com.design.flyweight.demo;

import java.util.Map;

public class MainFlyweight {

	public static void main(String[] args) {
		Flyweight flyweight1 = FlyweightFactory.getFlyweight("qianzhubing");
		Flyweight flyweight2 = FlyweightFactory.getFlyweight("qianzhubing");
		flyweight1.operation("hello world!");
		flyweight2.operation("java world!");
		System.out.println(flyweight1 == flyweight2);
		
		Flyweight flyweight3  = FlyweightFactory.getFlyweight("qianzb");
		System.out.println(flyweight1 == flyweight3);
		
		Map<String, Flyweight> map = FlyweightFactory.getPool();
		System.out.println(map.size());
	}
}
