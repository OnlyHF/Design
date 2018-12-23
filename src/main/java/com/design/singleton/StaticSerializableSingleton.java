package com.design.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 静态内置类可以达到线程安全问题，但如果遇到序列化对象时，
 * 使用默认但方式运行得到但结果还是多例的。
 * @author qianzhubing
 *
 */
public class StaticSerializableSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 88L;
	
	private static class InnerStaticSerializableHandler {
		private static final StaticSerializableSingleton singleton = new StaticSerializableSingleton();
	}
	
	private StaticSerializableSingleton () {
		
	}
	
	public static StaticSerializableSingleton getInstance() {
		return InnerStaticSerializableHandler.singleton;
	}
	
	/**
	 * 添加该方法时，在遇到序列化时，运行得到的结果依旧可以是单例模式的。
	 */
	protected Object readResolve() throws ObjectStreamException {
		System.out.println("调用了该方法：readResolve()");
		return InnerStaticSerializableHandler.singleton;
	}
}
