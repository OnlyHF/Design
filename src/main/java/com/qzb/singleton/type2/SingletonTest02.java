package com.qzb.singleton.type2;

public class SingletonTest02 {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println(instance == instance2);	// 返回true
	}
}


// 饿汉式(静态代码块)
class Singleton {
	
	// 1.私有化构造器，外部不能通过new创建
	private Singleton() {
		
	}
	
	// 2.本类内部创建对象示例
	private static Singleton instance;
	
	// 在静态代码块中创建对象
	static {
		instance = new Singleton();
	}
	
	// 3.提供给一个公有的静态方法，返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
}