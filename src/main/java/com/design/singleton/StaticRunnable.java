package com.design.singleton;

public class StaticRunnable implements Runnable {

	public void run() {
		System.out.println(StaticSingleton.getInstance().hashCode());
	}

}
