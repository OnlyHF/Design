package com.qzb.adapter.interfaceadapter;

public class Client {

	public static void main(String[] args) {
		AbstractAdapter adatper = new AbstractAdapter() {
			@Override
			public void m1() {
				super.m1();
				System.out.println("使用了m1方法");
			}
		};
		adatper.m1();
	}
}
