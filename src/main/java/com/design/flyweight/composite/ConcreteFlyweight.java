package com.design.flyweight.composite;
/**
* 复合享元模式中，具体享元角色类
* 
* @author qianzhubing
* @date 2018年12月23日 上午10:22:37
*/
public class ConcreteFlyweight implements Flyweight {

	private Character innerStatus;
	
	public ConcreteFlyweight(Character innserStatus) {
		this.innerStatus = innserStatus;
	}

	/**
	 * 由外蕴状态传过来的值来判断该如何处理
	 */
	public void operation(String outStatus) {
		System.out.println("外蕴状态为：" + outStatus);
		System.out.println("内蕴状态为：" + this.innerStatus);
	}

}
