package com.qzb.singleton.destroy;

import java.lang.reflect.Constructor;

/**
 * 破坏静态内部类单例模式：反射
 * @author qianzhubing
 *
 */
public class DestroySingletonTest02 {

	public static void main(String[] args) {
		Singleton02 singleton = Singleton02.getInstance();
		try {
			Class<Singleton02> singletonClass = (Class<Singleton02>)Class.forName("com.qzb.singleton.destroy.Singleton02");
			Constructor<Singleton02> constructorSingleton = singletonClass.getDeclaredConstructor(null);
			constructorSingleton.setAccessible(true);
			Singleton02 singleton2 = constructorSingleton.newInstance();
			
			System.out.println(singleton == singleton2);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

class Singleton02 {
	
	private Singleton02() {
		// 在私有构造器中添加判断，可以防止反射破坏单例模式
//		if(Singleton02Instance.INSTANCE != null) {
//			throw new RuntimeException("instance is created");
//		}
	}
	
	private static class Singleton02Instance {
		private static final Singleton02 INSTANCE = new Singleton02();
	}
	
	// 静态内部类保证
	public static Singleton02 getInstance() {
		return Singleton02Instance.INSTANCE;
	}
	
}