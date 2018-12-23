package com.design.flyweight.string;

/**
 * 在JAVA语言中，String类型就是使用了享元模式。String对象是final类型，对象一旦创建就不可改变。
 * 在JAVA中字符串常量都是存在常量池中的，JAVA会确保一个字符串常量在常量池中只有一个拷贝。
 * String a="abc"，其中"abc"就是一个字符串常量。
 * @author qianzhubing
 * @date 2018-12-19
 */
public class StringFlyweight {

	public static void main(String[] args) {
		String a = "123";
		String b = "123";
		System.out.println(a == b);
	}
}
