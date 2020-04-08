package com.design.proxy;

/**
 * 抽象对象角色
 * 
 * @author qianzhubing
 * @date   2019年12月13日 下午2:07:53
*/
public abstract class AbstractObject {

	/**
	 * 申明目标对象和代理对象的共同接口，这样一来在任何可以使用目标对象的地方都可以使用代理对象。
	 */
	public abstract void operation();
}
