package com.design.singleton;

public class StaticSingletonTest {

	public static void main(String[] args) {
		Thread[] threads = new Thread[5];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new StaticRunnable());
		}
		
		for (Thread t : threads) {
			t.start();
		}
		
	}
}
