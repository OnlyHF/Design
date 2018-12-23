package com.design.singleton;

import org.junit.Test;

public class DCLSingletonTest {

	@Test
	public void testDCL() {
		Thread run1 = new Thread(new DCLRunnable());
		Thread run2 = new Thread(new DCLRunnable());
		Thread run3 = new Thread(new DCLRunnable());
		Thread run4 = new Thread(new DCLRunnable());
		run1.start();
		run2.start();
		run3.start();
		run4.start();
	}
	
	public static void main(String[] args) {
		Thread run1 = new Thread(new DCLRunnable());
		Thread run2 = new Thread(new DCLRunnable());
		Thread run3 = new Thread(new DCLRunnable());
		Thread run4 = new Thread(new DCLRunnable());
		run1.start();
		run2.start();
		run3.start();
		run4.start();
	}
}
