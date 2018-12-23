package com.design.flyweight.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合享元对象是由单纯享元对象通过复合而成的，因此它提供了add()这样的聚集管理方法。
 * 由于一个复合享元对象具有不同的聚集元素，这些聚集元素在复合享元对象被创建之后加入，
 * 这本身就意味着复合享元对象的状态是会改变的，因此复合享元对象是不能共享的。
 * 
 * 复合享元角色实现了抽象享元角色所规定的接口，也就是operation()方法，这个方法有一个参数，代表复合享元对象的外蕴状态。
 * 一个复合享元对象的所有单纯享元对象元素的外蕴状态都是与复合享元对象的外蕴状态相等的；
 * 而一个复合享元对象所含有的单纯享元对象的内蕴状态一般是不相等的，不然就没有使用价值了。
 * 
* @author qianzhubing
* @date   2018年12月23日 上午10:27:49
*/
public class ConcreteCompositeFlyweight implements Flyweight {

	private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();
	
	/**
	 * 新增一个新的单纯享元对象到聚集中
	 */
	public void add(Character key, Flyweight flyweight) {
		files.put(key, flyweight);
	}
	
	/**
	 * 外蕴状态作为参数传入到复合享元对象中
	 */
	public void operation(String outStatus) {
		Flyweight flyweight = null;
		for(Character key : files.keySet()) {
			flyweight = files.get(key);
			flyweight.operation(outStatus);
		}
		System.out.println("复合享元对象operation()方法调用结束");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConcreteCompositeFlyweight other = (ConcreteCompositeFlyweight) obj;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		return true;
	}

	
	
}
