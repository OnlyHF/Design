package com.test;

import java.io.File;
import java.io.Serializable;

public class SubstringTest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String hi = "hi"; 

	public static void main(String[] args) {
		String str = "/aaa/111.test";
		String s = str.substring(0, str.lastIndexOf(File.separator));
		System.out.println(s);
	}
	
	
}