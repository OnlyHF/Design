package com.design.singleton;

/**
 * 使用静态内部类实现线程安全单例模式
 * 
 * @author qianzhubing
 *
 */
public class StaticSingleton {

	private StaticSingleton() {
		
	}
	
	public static StaticSingleton getInstance() {
		return InnerStaticHandler.singleton;
	}
	
	private static class InnerStaticHandler {
		private final static StaticSingleton singleton = new StaticSingleton();
	}
	
}
