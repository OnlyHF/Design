package com.design.proxy.dynamic.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author qianzhubing
 * @date   2020年4月9日 下午10:31:52
*/
public class StudentInvocationHandler implements InvocationHandler {

	private Object target;
	
	public StudentInvocationHandler(Object target) {
		this.target = target;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(method.getName() + "方法执行之前～～");
		Object returnObj = method.invoke(target, args);
		System.out.println(method.getName() + "方法执行之后。。。");
		return returnObj;
	}

}
