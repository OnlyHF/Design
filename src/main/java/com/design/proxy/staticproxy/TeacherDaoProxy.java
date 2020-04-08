package com.design.proxy.staticproxy;

/**
 * @author qianzhubing
 * @date   2020年4月8日 下午10:36:22
*/
public class TeacherDaoProxy implements ITeacherDao {

	// 目标对象，通过接口来聚合
	private ITeacherDao target;
	
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}

	public void teach() {
		System.out.println("代理开始。。。。。。");
		target.teach();
		System.out.println("提交。。。。。。。。");
	}

}
