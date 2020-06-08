package com.qzb.adapter.objectadapter;

// 适配器类
public class VoltageAdapter implements IVoltage5V {

	private Voltage220V voltage220V;
	
	// 关联关系的聚合
	public VoltageAdapter(Voltage220V voltage220V) {
		this.voltage220V = voltage220V;
	}
	
	@Override
	public int output5V() {
		if (voltage220V == null) {
			return 0;
		}
		int src = voltage220V.output220V();
		int dstV = src / 44;
		System.out.println("电压=" + dstV + "伏");
		return dstV;
	}

}
