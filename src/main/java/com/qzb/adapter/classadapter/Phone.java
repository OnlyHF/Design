package com.qzb.adapter.classadapter;

public class Phone {

	public void charging(IVoltage5V iVoltage5V) {
		if (iVoltage5V.output5V() == 5) {
			System.out.println("电压为5V，可以充电");
		} else if (iVoltage5V.output5V() > 5) {
			System.out.println("电压过高，炸了");
		}
	}
}
