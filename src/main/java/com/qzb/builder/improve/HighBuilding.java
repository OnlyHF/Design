package com.qzb.builder.improve;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("高楼打地基100米");
	}

	@Override
	public void buildWalls() {
		System.out.println("高楼打砌墙30厘米");
	}

	@Override
	public void roofed() {
		System.out.println("高楼盖屋顶");
	}

}
