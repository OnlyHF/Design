package com.qzb.adapter.classadapter;

// 适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		int src = super.output220V();
		int dstV = src / 44;
		System.out.println("电压=" + dstV + "伏");
		return dstV;
	}

}
