package com.qzb.prototype.deepclone;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		DeepProtoType prototype = new DeepProtoType();
		prototype.name = "张三";
		DeepCloneableTarget target = new DeepCloneableTarget("hello", "world");
		prototype.deepCloneableTarget = target;
		
//		DeepProtoType prototype2 = (DeepProtoType)prototype.clone();
//		
		
		DeepProtoType prototype2 = (DeepProtoType)prototype.deepClone();
		
		System.out.println(prototype == prototype2);
		
	}
	
}
