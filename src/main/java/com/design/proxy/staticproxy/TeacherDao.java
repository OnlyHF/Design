package com.design.proxy.staticproxy;

/**
 * @author qianzhubing
 * @date   2020年4月8日 下午10:35:30
*/
public class TeacherDao implements ITeacherDao {

	public void teach() {
		System.out.println("老师授课中。。。。。");
	}

}
