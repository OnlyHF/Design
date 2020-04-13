package com.design.proxy.cglib;

/**
 * @author qianzhubing
 * @date   2020年4月12日 下午10:14:40
*/
public class Client {

	public static void main(String[] args) {
		TeacherDao teacherDao = new TeacherDao();
		TeacherDao teacher = (TeacherDao)new ProxyFactory(teacherDao).getProxyInstance();
		// 执行代理对象的方法，触发intercept方法，从而实现对目标对象对调用
		teacher.teach();
	}
}
