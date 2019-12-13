package com.design.prototype.manager;

/**
 * 抽象原型角色
 * 
 * @author qianzhubing
 * @date   2019年12月2日 下午12:41:34
*/
public interface Prototype {

	public Prototype clone();
	
	public String getName();
	
	public void setName(String name);
}
