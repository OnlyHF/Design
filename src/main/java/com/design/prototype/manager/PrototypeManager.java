package com.design.prototype.manager;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器角色保持一个聚集，作为对所有原型对象的登记，这个角色提供必要的方法，供外界增加新的原型对象和取得已经登记过的原型对象。
 * 
 * @author qianzhubing
 * @date   2019年12月2日 下午12:48:03
*/
public class PrototypeManager {

	/**
	 * 用来记录原型的编号和原型实例的对应关系
	 */
	private static Map<String, Prototype> map = new HashMap<String, Prototype>();
	
	/**
	 * 私有化构造方法，避免外部创建实例
	 */
	private PrototypeManager() {
		
	}
	
	/**
	 * 向原型管理器里面添加或是修改某个原型注册
	 * 
	 * @param prototypeId
	 * @param prototype
	 */
	public synchronized static void setPrototype(String prototypeId, Prototype prototype) {
		map.put(prototypeId, prototype);
	}
	
	/**
	 * 从原型管理器里面删除某个原型注册
	 * 
	 * @param prototypeId
	 */
	public synchronized static void removePrototype(String prototypeId) {
		map.remove(prototypeId);
	}
	
	/**
	 * 获取某个原型编号对应的原型实例
	 * 
	 * @param prototypeId
	 * @return
	 */
	public synchronized static Prototype getPrototype(String prototypeId) {
		Prototype prototype = map.get(prototypeId);
		if (prototype == null) {
			throw new RuntimeException("您希望获取的原型还没有注册或已被销毁");
		}
		return prototype;
	}
}