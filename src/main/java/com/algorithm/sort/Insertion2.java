package com.algorithm.sort;

/**
 * @author qianzhubing
 * @date   2020年5月13日 下午11:42:11
 * 插入排序改进版
*/
public class Insertion2 extends Example {

	@Override
	public void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			for (; j >= 0 && super.less(temp, array[j]); j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = temp;
		}
	}

	@Override
	public Class getSort() {
		return Insertion2.class;
	}

	public static void main(String[] args) {
		new Insertion2().test();
	}
}
