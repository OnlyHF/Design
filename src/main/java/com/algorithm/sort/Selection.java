package com.algorithm.sort;

/**
 * @author qianzhubing
 * @date   2020年5月13日 下午10:51:30
 * 选择排序
 * 一种最简单的排序算法：首先，找到数组中最小的那个元素，其次，将它和数组的第一个元素交换位置(如果第一个元素就是最小元素那么它就和自己交换)。
 * 再次，在剩下的元素中找到最小的元素，将它与数组的第二个元素交换位置。如此往复，直到将整个数组排序。这种方法叫做选择排序，
 * 因为它在不断的选择剩余元素之中的最小者。
 * 
*/
public class Selection extends Example {

	/**
	 * 按升序排序
	 */
	@Override
	public void sort(int[] array) {
		int min;
		for (int i = 0; i < array.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (super.less(array[j], array[min])) {
					min = j;
				}
			}
			super.exch(array, min, i);
		}
	}
	
	
	@Override
	public Class getSort() {
		return Selection.class;
	}
	
	
	public static void main(String[] args) {
		new Selection().test();
	}



}
