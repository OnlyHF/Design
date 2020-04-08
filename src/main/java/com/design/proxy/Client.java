package com.design.proxy;

/**
 * 客户端demo
 * 
 * @author qianzhubing
 * @date   2019年12月13日 下午2:18:11
*/
public class Client {

	public static void main(String[] args) {
		ProxyObject proxy = new ProxyObject();
		proxy.operation();
	}
}
