package com.design.flyweight.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端测试
 * 
 * @author qianzhubing
 * @date 2018年12月23日 上午11:06:19
 */
public class Client {

	public static void main(String[] args) {
		List<Character> statusList = new ArrayList<Character>();
		statusList.add('A');
		statusList.add('B');
		statusList.add('C');
		statusList.add('D');
		Flyweight compositeFlyweight1 = FlyweightFactory.factory(statusList);
		Flyweight compositeFlyweight2 = FlyweightFactory.factory(statusList);
		compositeFlyweight1.operation("hello qianzhubing");
		System.out.println();
		compositeFlyweight2.operation("hello qianzhubing");
		System.out.println();
		System.out.println(
				"compositeFlyweight1 == compositeFlyweight2 ? " + (compositeFlyweight1 == compositeFlyweight2));
		System.out.println("compositeFlyweight1.equals(compositeFlyweight2) ? "
				+ (compositeFlyweight1.equals(compositeFlyweight2)));
		
		Flyweight flyweight1 = FlyweightFactory.factory('A');
		Flyweight flyweight2 = FlyweightFactory.factory('A');
		Flyweight flyweight3 = FlyweightFactory.factory('B');
		System.out.println("flyweight1 == flyweight2 ? " + (flyweight1 == flyweight2));
		System.out.println("flyweight1 == flyweight3 ? " + (flyweight1 == flyweight3));
		flyweight1.operation("A");
		flyweight2.operation("A");
		flyweight3.operation("B");
	}
}
