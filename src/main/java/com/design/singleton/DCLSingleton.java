package com.design.singleton;

/**
 * DCL(Double check Locking)双重检查机制
 * @author qianzhubing
 *
 */
public class DCLSingleton {

	private static DCLSingleton singleton = null;
	
	private DCLSingleton() {
		
	}
	
	public static DCLSingleton getInstance() {
		if (singleton == null) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (DCLSingleton.class) {
				if (singleton == null) {
					singleton = new DCLSingleton();
				}
			}
		}
		return singleton;
	}
}
