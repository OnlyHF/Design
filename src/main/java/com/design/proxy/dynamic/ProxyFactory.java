package com.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author qianzhubing
 * @date   2020年4月9日 下午9:37:45
*/
public class ProxyFactory {

	// 维护一个目标对象，Object
	private Object target;

	// 构造器，对target进行初始化
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	// 给目标对象生成一个代理对象
	public Object getProxyInstance() {
		/**
		 *     public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
         * ClassLoader loader : 指定当前目标对象使用的类加载器，获取加载器的方法固定
         * Class<?>[] interfaces ： 目标对象实现的接口类型，使用范型方法确认类型
         * InvocationHandler h ： 事件处理，执行目标对象方法时，会触发事件处理器方法;
         * 		表示的是当动态代理对象调用方法的时候会关联到哪一个InvocationHandler对象上，并最终由其调用。
		 */
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("JDK代理开始～～");
				// 通过反射机制调用目标对象的方法
				Object returnVal = method.invoke(target, args);
				System.out.println("JDK代理结束。");
				return returnVal;
			}
		});
	}
	
}
