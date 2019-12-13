package com.design.prototype.simple;

/**
 * 具体原型（Concrete Prototype）角色：被复制的对象。此角色需要实现抽象的原型角色所要求的接口。
 * 
 * @author qianzhubing
 * @date   2019年12月2日 下午12:27:44
*/
public class ConcretePrototype1 implements Prototype {

	public Prototype prototypeClone() {
		// 进行简单的克隆，新建一个自身对象，没有属性
		return new ConcretePrototype1();
	}

}
