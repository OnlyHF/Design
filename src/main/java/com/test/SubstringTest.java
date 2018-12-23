package com.test;

import java.io.File;

public class SubstringTest {

	public static void main(String[] args) {
		String str = "/aaa/111.test";
		String s = str.substring(0, str.lastIndexOf(File.separator));
		System.out.println(s);
	}
}
