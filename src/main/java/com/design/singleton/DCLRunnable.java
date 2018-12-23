package com.design.singleton;

public class DCLRunnable implements Runnable {

	public void run() {
		System.out.println(DCLSingleton.getInstance().hashCode());		
	}

}
