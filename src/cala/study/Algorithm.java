package cala.study;

/**
 * 算法学习
 */
public class Algorithm {

	// 冒泡算法
	/**
	 * 冒泡排序要对一个列表多次重复遍历。它要比较相邻的两项，并且交换顺序排错的项。每对 列表实行一次遍历，就有一个最大项排在了正确的位置。
	 * 大体上讲，列表的每一个数据项都会在 其相应的位置 “冒泡”。如果列表有 n 项，第一次遍历就要比较 n-1 对数据。需要注意，一旦列 表中最大
	 * (按照规定的原则定义大小)的数据是所比较的数据对中的一个，它就会沿着列表一直 后移，直到这次遍历结束。
	 * */
	public static final void bubbleSort(int[] srcs) {
		if (srcs == null || srcs.length == 0) {
			return;
		}

		for (int i = srcs.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (srcs[j] > srcs[j + 1]) {
					int temp = srcs[j];
					srcs[j] = srcs[j + 1];
					srcs[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < srcs.length; i++) {

			System.out.println(srcs[i] + " ");
		}
	}
	
	//选择排序
	public static final void selectionSort(int[] srcs){
		
	}
}
