package com.jdk.lang.runtime;

/**
 * Runtime.getRuntime().addShutdownHook()
 * 这个方法的意思就是在jvm中增加一个关闭的钩子，当jvm关闭的时候，会执行系统中已经设置的所有通过方法addShutdownHook添加的钩子，
 * 当系统执行完这些钩子后，jvm才会关闭。所以这些钩子可以在jvm关闭的时候进行内存清理、对象销毁等操作。
 * 
 * @author qianzhubing
 *
 */
public class RuntimeShutdownHook {
	
	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				super.run();
				System.out.println(Thread.currentThread().getName() + "  shutdownHook...");
			}
		});
		
		while (true) {
			try {
				Thread.sleep(1000 * 3L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}

}
