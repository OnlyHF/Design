package com.qzb.builder.improve;

// 指挥者
public class HouseDirector {

	HouseBuilder houseBuilder = null;
	
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	// 如何建造房子，由指挥者处理
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		
		return houseBuilder.buildHouse();
	}
}
