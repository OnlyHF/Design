package com.qzb.factory.sample.pizzastore.order;

import com.qzb.factory.sample.pizzastore.pizza.Pizza;

public class OrderPizza {

	private SimpleFactory simpleFactory;
	
	public void setSimpleFactory(SimpleFactory simpleFactory) {
		this.simpleFactory = simpleFactory;
	}
	
	public void order(String type) {
		Pizza pizza = simpleFactory.createPizza(type);
		if (pizza == null) {
			System.out.println("无此披萨");
			return;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
	
}
