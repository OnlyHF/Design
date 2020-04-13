package com.design.proxy.dynamic;

/**
 * @author qianzhubing
 * @date   2020年4月9日 下午9:37:02
*/
public class TeacherDao implements ITeacherDao {

	public void teach() {
		System.out.println("老师正在授课中。。。。。。");
	}

	public String sayHello(String hello) {
		System.out.println("sayHello()执行中。。。。");
		return "say " + hello;
	}

	
}
