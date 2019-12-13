package com.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 把对象写到流里的过程是序列化(Serialization)过程；而把对象从流中读出来的过程则叫反序列化(Deserialization)过程。
 * 应当指出的是，写到流里的是对象的一个拷贝，而原对象仍然存在于JVM里面。
 * 
 * 克隆对象中，若有引用对象，则引用对象也需要实现接口Serializable，无论引用对象中是否含有其它引用对象，
 * 都必须实现Serializable接口，否则报错:java.io.NotSerializableException
 * 
 * @author qianzhubing
 * @date   2019年12月13日 上午10:48:58
*/
public class SerializableClone implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CloneDemo demo = new CloneDemo();
	
	public static void main(String[] args) {
		SerializableClone c1 = new SerializableClone();
		SerializableClone c2 = (SerializableClone)c1.deepClone();
		System.out.println(c1.demo == c2.demo);
		System.out.println(c1.demo);
		System.out.println(c2.demo);
	}
	
	public Object deepClone() {
		ByteArrayOutputStream bos = null; 
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			// 序列化，将对象写到流
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			// 反序列化，从流中读取对象
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			return ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return null;
	}
}
