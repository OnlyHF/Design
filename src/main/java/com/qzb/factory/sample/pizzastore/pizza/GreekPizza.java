package com.qzb.factory.sample.pizzastore.pizza;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println(" 给制作希腊披萨准备原材料 ");
	}

}
