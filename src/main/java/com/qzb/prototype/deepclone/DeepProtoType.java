package com.qzb.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable, Cloneable {


	public String name;	
	public DeepCloneableTarget deepCloneableTarget;
	
	public DeepProtoType() {
		super();
	}
	
	// 深拷贝 - 方式一：使用clone方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object deep = null;
		// 这里完成对基本数据类型及字符串对克隆
		deep = super.clone();
		
		// 对引用类型进行单独处理
		DeepProtoType type = (DeepProtoType)deep;
		DeepCloneableTarget target = (DeepCloneableTarget)type.deepCloneableTarget.clone();
		type.deepCloneableTarget = target;
		
		return deep;
	}
	
	// 深拷贝 - 方式二：通过对想对序列化实现深拷贝（推荐）
	public Object deepClone() {
		Object obj = null;
		// 创建流对象
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			// 序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);	// 当前这个对象以对象流的方式输出
			
			//  反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			obj = ois.readObject();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return obj;
	}
	
}
