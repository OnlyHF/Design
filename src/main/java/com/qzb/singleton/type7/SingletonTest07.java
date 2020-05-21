package com.qzb.singleton.type7;

public class SingletonTest07 {

	public static void main(String[] args) {
		System.out.println("静态内部类完成单例模式");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);	// true
	}
}

class Singleton {
	
	private Singleton() {
		
	}
	
	// 静态内部类，该类中有一个静态属性Singleton
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton();
	}
	
	// 提供一个静态的公有方法，直接返回Singleton.INSTANCE
	// 推荐使用
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
	
}
