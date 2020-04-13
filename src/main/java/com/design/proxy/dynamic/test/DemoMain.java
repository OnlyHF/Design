package com.design.proxy.dynamic.test;

/**
 * @author qianzhubing
 * @date   2020年4月9日 下午10:36:52
*/
public class DemoMain {

	public static void main(String[] args) {
		// 创建目标对象
		People student = new Student();
		// 通过JDK创建代理对象
		People people = (People)new ProxyFactory(student).getProxyInstance();
		people.read();
	}
}
