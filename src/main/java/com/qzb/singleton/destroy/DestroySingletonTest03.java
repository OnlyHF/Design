package com.qzb.singleton.destroy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 序列化+反序列化 破坏单例模式
 * 在对象反序列化的过程中，反序列化会通过反射调用无参数的构造方法创建一个新的对象，所以，通过反序列化也能破坏单例。
 * @author qianzhubing
 *
 */
public class DestroySingletonTest03 {

	public static void main(String[] args) {
		Singleton03 singleton = Singleton03.getInstance();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
			oos.writeObject(singleton);
			
			ois = new ObjectInputStream(new FileInputStream("tempFile"));
			Singleton03 singleton2 = (Singleton03)ois.readObject();
			
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

class Singleton03 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static volatile Singleton03 instance;
	
	private Singleton03() {
		// 序列化、反序列化中，只有新增readResolve方法，并在该方法中返回生成单例策略才能保证单例模式，
		// 在私有构造器中进行判断是不能做到单例模式对控制
//		if(instance != null) {
//			throw new RuntimeException("Error");
//		}
	}
	
	public static Singleton03 getInstance() {
		if (instance == null) {
			synchronized(Singleton01.class) {
				if (instance == null) {
					instance = new Singleton03();
				}
			}
		}
		return instance;
	}
	
	/**
	 * 增加readResolve方法，并在该方法中指定要返回的对象的生成策略就可以保证单例
	 * 
	 * 因为反序列化过程中，在反序列化执行过程中会执行到ObjectInputStream#readOrdinaryObject方法，
	 * 这个方法会判断对象是否包含readResolve方法，如果包含的话会直接调用这个方法获得对象实例。
	 */
//	public Object readResolve() {
//		return getInstance();
//	}
	
}