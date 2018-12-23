package com.design.flyweight.composite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 享元工厂角色类提供了两种不同的方法：
 * 	一种用于提供单纯享元对象；
 * 	另一种用于提供复合享元对象；
 * 
 * @author qianzhubing
 * @date   2018年12月23日 上午10:50:17
*/
public class FlyweightFactory {
	
	private static Map<Character, Flyweight> pools = new HashMap<Character, Flyweight>();
	
	/**
	 * 提供单纯的享元对象
	 * 
	 * @param status
	 * @return
	 */
	public static Flyweight factory(Character status) {
		Flyweight flyweight = pools.get(status);
		if (flyweight == null) {
			flyweight = new ConcreteFlyweight(status);
			pools.put(status, flyweight);
		}
		return flyweight;
	}
	
	/**
	 * 提供复合享元对象
	 * 
	 * @param statusList
	 * @return
	 */
	public static Flyweight factory(List<Character> statusList) {
		ConcreteCompositeFlyweight compositeFlyweight = new ConcreteCompositeFlyweight();
		for (Character status : statusList) {
			compositeFlyweight.add(status, factory(status));
		}
		return compositeFlyweight;
	}
}
