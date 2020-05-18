package com.algorithm.sort;

/**
 * @author qianzhubing
 * @date   2020年5月12日 下午10:38:30
 * 排序算法类模板
 * 默认按照从小到大排序
 * 
*/
public abstract class Example {

	/**
	 * 需要其子类实现的算法
	 * 默认按升序
	 */
	public abstract void sort(int[] array);
	
	/**
	 * 判断两个元素大小
	 * @return v < w
	 */
	public boolean less(int v, int w) {
		return v < w;
	}
	
	/**
	 * 交换数组中两个下标对应的数据
	 */
	public void exch(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	/**
	 * 输出打印
	 * @param a
	 */
	public void show(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 判断是否以排序
	 * @param a
	 * @return
	 */
	public boolean isSorted(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i-1])) {
				return false;
			}
		}
		return true;
	}
	
	public abstract Class getSort();
	
	public void test() {
		int[] array = {1,3,5,7,2,3,4,5,10,5,2,6,7,1};
		Example selection = SortFactory.getSort(getSort());
		selection.show(array);
		selection.sort(array);
		selection.show(array);
	}
}
