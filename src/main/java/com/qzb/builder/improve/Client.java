package com.qzb.builder.improve;

public class Client {

	public static void main(String[] args) {
		HouseDirector d1 = new HouseDirector(new CommonHouse());
		d1.constructHouse();
	}
}
