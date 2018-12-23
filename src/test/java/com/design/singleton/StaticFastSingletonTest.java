package com.design.singleton;

public class StaticFastSingletonTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new StaticFastRunnable());
		Thread t2 = new Thread(new StaticFastRunnable());
		Thread t3 = new Thread(new StaticFastRunnable());
		t1.start();
		t2.start();
		t3.start();
	}
}
