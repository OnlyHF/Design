package com.qzb.singleton.destroy;

import java.lang.reflect.Constructor;

/**
 * 破坏双重检查单例模式：反射
 * @author qianzhubing
 *
 */
public class DestroySingletonTest01 {

	public static void main(String[] args) {
		Singleton01 singleton = Singleton01.getInstance();
		try {
			Class<Singleton01> singletonClass = (Class<Singleton01>)Class.forName("com.qzb.singleton.destroy.Singleton01");
			Constructor<Singleton01> constructorSingleton = singletonClass.getDeclaredConstructor(null);
			constructorSingleton.setAccessible(true);
			Singleton01 singleton2 = constructorSingleton.newInstance();
			
			System.out.println(singleton == singleton2);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

class Singleton01 {
	
	private static volatile Singleton01 instance;
	
	private Singleton01() {
		// 在私有构造器中添加判断，可以防止反射破坏单例模式
//		if(instance != null) {
//			throw new RuntimeException("instance is created");
//		}
	}
	
	// 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载
	// 同时保证了效率，推荐使用
	public static Singleton01 getInstance() {
		if (instance == null) {
			synchronized(Singleton01.class) {
				if (instance == null) {
					instance = new Singleton01();
				}
			}
		}
		return instance;
	}
	
}