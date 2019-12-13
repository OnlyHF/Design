package com.design.prototype.manager;

/**
 * 具体原型角色
 * 
 * @author qianzhubing
 * @date   2019年12月2日 下午12:46:40
*/
public class ConcretePrototype2 implements Prototype {

	private String name;
	
	public Prototype clone() {
		Prototype prototype = new ConcretePrototype2();
		prototype.setName(this.name);
		return prototype;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "ConcretePrototype2 name is " + this.name;
	}
	

}
