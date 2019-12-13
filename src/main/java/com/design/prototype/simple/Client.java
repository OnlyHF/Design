package com.design.prototype.simple;

/**
 * 客户(Client)角色：客户类提出创建对象的请求。
 * 
 * @author qianzhubing
 * @date   2019年12月2日 下午12:31:16
*/
public class Client {

	/**
	 * 持有需要使用的原型接口对象
	 */
	private Prototype prototype;
	
	/**
	 * 构造方法，传入需要使用的原型接口对象
	 */
	public Client(Prototype prototype) {
		this.prototype = prototype;
	}
	
	/**
	 * 需要创建原型接口的对象
	 */
	public void operation(Prototype prototype) {
		Prototype copyPropertype = (Prototype)prototype.prototypeClone();
	}
}
