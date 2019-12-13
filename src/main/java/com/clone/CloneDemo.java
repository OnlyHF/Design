package com.clone;

import java.io.Serializable;

import com.test.SubstringTest;

/**
 * 克隆demo
 * 
 * Java语言提供的Cloneable接口只起一个作用，就是在运行时期通知Java虚拟机可以安全地在这个类上使用clone()方法。
 * 通过调用这个clone()方法可以得到一个对象的复制。由于Object类本身并不实现Cloneable接口，因此如果所考虑的类
 * 没有实现Cloneable接口时，调用clone()方法会抛出CloneNotSupportedException异常。
 * 
 * clone()方法将对象复制了一份并返还给调用者。所谓“复制”的含义与clone()方法是怎么实现的。一般而言，clone()方法满足以下的描述：
 * （1）对任何的对象x，都有：x.clone()!=x。换言之，克隆对象与原对象不是同一个对象。
 * （2）对任何的对象x，都有：x.clone().getClass() == x.getClass()，换言之，克隆对象与原对象的类型一样。
 * （3）如果对象x的equals()方法定义其恰当的话，那么x.clone().equals(x)应当成立的。
 * 在JAVA语言的API中，凡是提供了clone()方法的类，都满足上面的这些条件。JAVA语言的设计师在设计自己的clone()方法时，也应当遵守着三个条件。
 * 一般来说，上面的三个条件中的前两个是必需的，而第三个是可选的。
 * 
 * @author qianzhubing
 * @date 2019年12月13日 上午9:48:02
 */
public class CloneDemo implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String demo = "hello";
	
	public SubstringTest test = new SubstringTest();
	
	public static void main(String[] args) {
		try {
			CloneDemo c1 = new CloneDemo();
			CloneDemo c2 = (CloneDemo)c1.clone();
			System.out.println(c1 == c2);
			System.out.println(c1.getClass() + " : " +(c1.getClass() == c2.getClass()));
			System.out.println(c1.equals(c2));
			System.out.println("c1.demo = " + c1.demo);
			System.out.println("c2.demo = " + c2.demo);
			c2.demo = "world";
			System.out.println();
			System.out.println("c1.demo = " + c1.demo);
			System.out.println("c2.demo = " + c2.demo);
			System.out.println();
			System.out.println("c1.test.hi = " + c1.test.hi);
			System.out.println("c2.test.hi = " + c2.test.hi);
			c1.test.hi = "hey";
			// 浅克隆，没有对引用的对象进行克隆，当修改引用对象的属性时，两个对象c1、c2同时都改变了，所以是浅克隆
			System.out.println("c1.test.hi = " + c1.test.hi);
			System.out.println("c2.test.hi = " + c2.test.hi);
			System.out.println(c1.test == c2.test);
			c2.test = new SubstringTest();
			System.out.println(c1.test == c2.test);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
}
