package com.qzb.singleton.destroy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 反序列化是破坏不了单例模式的
 * 在序列化的时候Java仅仅是将枚举对象的name属性输出到结果中，反序列化的时候则是通过java.lang.Enum的valueOf方法来根据名字查找枚举对象。
 * 同时，编译器是不允许任何对这种序列化机制的定制的，因此禁用了writeObject、readObject、readObjectNoData、writeReplace和readResolve等方法
 * @author qianzhubing
 *
 */
public class DestroySingletonTest05 {

	public static void main(String[] args) {
		Singleton05 singleton = Singleton05.INSTANCE;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
			oos.writeObject(singleton);
			
			ois = new ObjectInputStream(new FileInputStream("tempFile"));
			Singleton05 singleton2 = (Singleton05)ois.readObject();
			
			System.out.println(singleton == singleton2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
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
	}
}

enum Singleton05 implements Serializable {
	
	INSTANCE;
	
}