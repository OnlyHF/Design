package com.qzb.factory.sample.pizzastore.order;

import com.qzb.factory.sample.pizzastore.pizza.CheesePizza;
import com.qzb.factory.sample.pizzastore.pizza.GreekPizza;
import com.qzb.factory.sample.pizzastore.pizza.Pizza;

// 简单工厂类
public class SimpleFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("greek".equals(type)) {
			pizza = new GreekPizza();
			pizza.setName(" 希腊披萨 ");
		} else if ("cheese".equals(type)){
			pizza = new CheesePizza();
			pizza.setName(" 奶酪披萨 ");
		} 
		
		return pizza;
	}
}
