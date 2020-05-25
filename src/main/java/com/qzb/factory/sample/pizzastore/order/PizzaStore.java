package com.qzb.factory.sample.pizzastore.order;

public class PizzaStore {

	public static void main(String[] args) {
		OrderPizza orderPizza = new OrderPizza();
		orderPizza.setSimpleFactory(new SimpleFactory());
		orderPizza.order("cheese1");
	}
	
}
