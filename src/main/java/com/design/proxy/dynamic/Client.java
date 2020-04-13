package com.design.proxy.dynamic;

/**
 * @author qianzhubing
 * @date   2020年4月9日 下午9:48:21
*/
public class Client {

	public static void main(String[] args) {
		// 创建目标对象
		ITeacherDao target = new TeacherDao();
		// 给目标对象创建代理对象，可以转成ITeacherDao，不能强制转换为目标对象
		ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
		
		// proxyInstance = class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
		System.out.println("proxyInstance = " + proxyInstance.getClass());
		
		// 通过代理对象调用目标对象方法
//		proxyInstance.teach();
		
		System.out.println(proxyInstance.sayHello("Hello"));
	}
}
