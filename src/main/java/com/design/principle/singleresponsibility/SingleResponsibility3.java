package com.design.principle.singleresponsibility;

/**
 * @author qianzhubing
 * @date   2020年4月15日 下午12:20:35
*/
public class SingleResponsibility3 {

	public static void main(String[] args) {
		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.roadRun("奔驰");
		vehicle2.airRun("波音747");
		vehicle2.waterRun("潜水艇");
	}
}

// 类中逻辑很简单，虽然破坏了类但单一职责原则，但在方法上遵守类单一职责原则
class Vehicle2 {
	public void roadRun(String vehicle) {
		System.out.println(vehicle + "在公路上驰骋。。。。");
	}
	
	public void airRun(String vehicle) {
		System.out.println(vehicle + "在天空遨游。。。");
	}
	
	public void waterRun(String vehicle) {
		System.out.println(vehicle + "在水中畅游。。。");
	}
	
}
