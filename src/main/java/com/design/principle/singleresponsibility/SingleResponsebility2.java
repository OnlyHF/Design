package com.design.principle.singleresponsibility;

/**
 * @author qianzhubing
 * @date   2020年4月14日 下午10:32:11
*/
public class SingleResponsebility2 {

	public static void main(String[] args) {
		RoadVehicle roadVehicle = new RoadVehicle();
		AirVehicle airVehicle = new AirVehicle();
		WaterVehicle waterVehicle = new WaterVehicle();
		
		roadVehicle.run("汽车");
		airVehicle.run("飞机");
		waterVehicle.run("潜水艇");
		
	}
}

// 方式2: 实现了单一职责原则，但代码成本较高
class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "在公路上奔驰。。。");
	}
}

class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "在天空遨游....");
	}
}

class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "在水中畅游。。。。");
	}
}
