package com.qzb.builder;

public abstract class AbstractHouse {
	
	// 打地基
	public abstract void buildHouse();
	
	// 砌墙
	public abstract void buildWalls();
	
	// 封顶
	public abstract void roofed();
	
	public void build() {
		buildHouse();
		buildWalls();
		roofed();
	}

}
