package com.design.proxy.cglib;

/**
 * @author qianzhubing
 * @date   2020年4月12日 下午10:03:12
*/
public class TeacherDao {

	public void teach() {
		System.out.println("cglib代理，不需要实现接口，老师授课中。。。");
	}
}
