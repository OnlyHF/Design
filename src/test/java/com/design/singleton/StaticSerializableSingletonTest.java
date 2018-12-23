package com.design.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StaticSerializableSingletonTest {

	public static void main(String[] args) {
		String filePath = "src/main/resources/singleton/staticSerializable.txt";
		ObjectOutputStream out = null;
		try {
			StaticSerializableSingleton singleton = StaticSerializableSingleton.getInstance();
			out = new ObjectOutputStream(
					new FileOutputStream(new File(filePath)));
			out.writeObject(singleton);
			System.out.println("writeObject---> " + singleton.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream(new File(filePath)));
			StaticSerializableSingleton readSingleton = (StaticSerializableSingleton)in.readObject();
			System.out.println("readObject---> " + readSingleton.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
