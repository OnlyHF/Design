package com.design.proxy.staticproxy;

/**
 * @author qianzhubing
 * @date   2020年4月8日 下午10:41:14
*/
public class Client {

	public static void main(String[] args) {
		ITeacherDao teacher = new TeacherDao();
		TeacherDaoProxy teacherProxy = new TeacherDaoProxy(teacher);
		teacherProxy.teach();
	}

}
