package com.qzb.singleton.type1;

public class SingletonTest01 {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println(instance == instance2);	// 返回true
	}
}


// 饿汉式(静态变量)
class Singleton {
	
	// 1.私有化构造器，外部不能通过new创建
	private Singleton() {
		
	}
	
	// 2.本类内部创建对象示例
	private final static Singleton instance = new Singleton();
	
	// 3.提供给一个公有的静态方法，返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
}