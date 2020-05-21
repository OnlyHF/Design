package com.qzb.singleton.type8;

public class SingletonTest08 {

	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		
		System.out.println(instance == instance2);
	}
}

// 使用枚举，可以实现单例，推荐使用
enum Singleton {
	INSTANCE;
	
	public void sayOK() {
		System.out.println("ok...");
	}
}