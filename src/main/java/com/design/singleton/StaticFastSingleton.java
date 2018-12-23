package com.design.singleton;

/**
 * 静态块的代码在使用类的时候就已经执行了，
 * 所以可以应用静态代码块的这个特性来实现单例设计模式
 *  
 * @author qianzhubing
 *
 */
public class StaticFastSingleton {

	private static StaticFastSingleton singleton = null;
	
	static {
		singleton = new StaticFastSingleton();
	}
	
	private StaticFastSingleton () {
		
	}
	
	public static StaticFastSingleton getInstance() {
		return singleton;
	}
}
