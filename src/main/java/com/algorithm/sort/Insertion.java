package com.algorithm.sort;

/**
 * @author qianzhubing
 * @date   2020年5月13日 下午11:23:40
 * 插入排序
*/
public class Insertion extends Example {

	@Override
	public void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && super.less(array[j], array[j-1]); j--) {
				super.exch(array, j, j - 1);
			}
		}
	}

	@Override
	public Class getSort() {
		return Insertion.class;
	}
	
	public static void main(String[] args) {
		new Insertion().test();
	}

}
