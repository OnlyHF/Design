package com.qzb.prototype.deepclone;

import java.util.ArrayList;

/**
 * ArrayList.clone属于浅拷贝
 * @author qianzhubing
 *
 */
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		User u = new User("张三", "男");
		list.add(u);
		
		ArrayList list2 = (ArrayList)list.clone();
		System.out.println(list == list2);
		((User)list.get(0)).name = "李四";		
		
		System.out.println(list);
		System.out.println(list2);
	}
}
