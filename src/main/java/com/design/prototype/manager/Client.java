package com.design.prototype.manager;

/**
 * 客户端角色
 * 
 * @author qianzhubing
 * @date   2019年12月2日 下午12:53:34
*/
public class Client {

	public static void main(String[] args) {
		Prototype p1 = new ConcretePrototype1();
		PrototypeManager.setPrototype("p1", p1);
		
		Prototype p11 = PrototypeManager.getPrototype("p1").clone();
		p11.setName("test20191202");
		System.out.println(p11);
		
		Prototype p2 = new ConcretePrototype2();
		PrototypeManager.setPrototype("p1", p2);
		
		p11 = PrototypeManager.getPrototype("p1").clone();
		p11.setName("test");
		System.out.println(p11);
		while (true) {
			
		}
	}
}
