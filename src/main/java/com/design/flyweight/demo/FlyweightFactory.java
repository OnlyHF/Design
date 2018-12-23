package com.design.flyweight.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式工厂类
 * 
 * 享元工厂角色类，必须指出的是，客户端不可以直接将具体享元类实例化，而必须通过一个工厂对象，
 * 利用一个factory()方法得到享元对象。一般而言，享元工厂对象在整个系统中只有一个，因此也可以使用单例模式
 * @author qianzhubing
 *
 */
public class FlyweightFactory {

	private static final Map<String, Flyweight> pool = new HashMap<String, Flyweight>();
	
	public static Flyweight getFlyweight(String innerState) {
		Flyweight flyweight = pool.get(innerState);
		if (flyweight == null) {
			flyweight = new CreateFlyweight(innerState);
			pool.put(innerState, flyweight);
		}
		return flyweight;
	}
	
	public static Map<String, Flyweight> getPool () {
		return pool;
	}
}
