package com.design.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author qianzhubing
 * @date   2020年4月12日 下午10:04:15
*/
public class ProxyFactory implements MethodInterceptor{
	
	// 维护一个目标对象
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}

	/**
	 * 返回一个代理对象,是target对象的代理对象
	 */
	public Object getProxyInstance() {
		// 1.创建一个工具类
		Enhancer enhancer = new Enhancer();
		// 2.设置父类
		enhancer.setSuperclass(target.getClass());
		// 3.设置回调函数
		enhancer.setCallback(this);
		// 4.创建子类对象，即代理对象
		return enhancer.create();
	}

	/**
	 * 重写intercept方法，会调用目标对象的方法
	 */
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("cglib代理模式开始。。。。");
		Object returnObj = method.invoke(target, args);
		System.out.println("cglib代理模式结束。。。。");
		return returnObj;
	}

}
