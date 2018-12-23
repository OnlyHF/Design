package com.design.flyweight.composite;

/**
 * 抽象享元模式角色类
 * 
 * @author qianzhubing
 * @date 2018-12-23
 */
public interface Flyweight {

	/**
	 * 抽象角色类示例方法
	 * @param outStatus	外蕴状态，一般由客户端传给服务器端
	 */
	void operation(String outStatus);
}
