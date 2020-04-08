package com.design.proxy;

/**
 * 目标对象角色
 * 
 * @author qianzhubing
 * @date   2019年12月13日 下午2:11:26
*/
public class RealObject extends AbstractObject {

	/**
	 * 定义了代理对象所代表的目标对象
	 */
	@Override
	public void operation() {
		System.out.println(this.getClass() + " : 某些操作！");
	}

}
