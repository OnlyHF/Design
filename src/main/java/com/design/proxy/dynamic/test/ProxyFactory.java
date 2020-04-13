package com.design.proxy.dynamic.test;

import java.lang.reflect.Proxy;

/**
 * @author qianzhubing
 * @date   2020年4月9日 下午10:40:42
*/
public class ProxyFactory {

	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	// 通过JDK动态生成目标代理对象
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new StudentInvocationHandler(target));
	}
}
