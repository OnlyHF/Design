package com.algorithm.sort;

/**
 * @author qianzhubing
 * @date   2020年5月13日 下午10:58:41
*/
public class SortFactory {

	public static Example getSort(Class c) {
		try {
			return (Example)c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
