package cala.study;

import java.util.HashMap;

/**
 * 算法学习
 */
public class Algorithm {

	// 冒泡算法
	/**
	 * 冒泡排序要对一个列表多次重复遍历。它要比较相邻的两项，并且交换顺序排错的项。每对 列表实行一次遍历，就有一个最大项排在了正确的位置。
	 * 大体上讲，列表的每一个数据项都会在 其相应的位置 “冒泡”。如果列表有 n 项，第一次遍历就要比较 n-1 对数据。需要注意，一旦列 表中最大
	 * (按照规定的原则定义大小)的数据是所比较的数据对中的一个，它就会沿着列表一直 后移，直到这次遍历结束。
	 */
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

	// 选择排序
	/**
	 * 选择排序提高了冒泡排序的性能，它每遍历一次列表只交换一次数据，即进行一次遍历时找 到最大的项，完成遍历后，再把它换到正确的位置。
	 * 和冒泡排序一样，第一次遍历后，最大的数 据项就已归位，第二次遍历使次大项归位。这个过程持续进行，一共需要 n-1 次遍历来排好 n 个数 据，
	 * 因为最后一个数据必须在第 n-1 次遍历之后才能归位。
	 */
	public static final void selectionSort(int[] srcs) {
		if (srcs == null || srcs.length == 0) {
			return;
		}

		for (int i = 0; i < srcs.length - 1; i++) {
			for (int j = i + 1; j < srcs.length; j++) {
				if (srcs[j] < srcs[i]) {
					int temp = srcs[j];
					srcs[j] = srcs[i];
					srcs[i] = temp;
				}
			}
		}

		for (int i = 0; i < srcs.length; i++) {
			System.out.println(srcs[i] + " ");
		}

	}

	// 插入排序
	/**
	 * 插入排序的算法复杂度仍然是 O(n^2)，但其工作原理稍有不同。它总是保持一个位置靠前的 已排好的子表，然后每一个新的数据项被 “插入”
	 * 到前边的子表里，排好的子表增加一项。我们认为只含有一个数据项的列表是已经排好的。每排后面一个数据（从 1 开始到 n-1）， 这
	 * 个的数据会和已排好子表中的数据比较。比较时，我们把之前已经排好的列表中比这个数据大的移到它的右边。当子表数据小于当前数据，
	 * 或者当前数据已经和子表的所有数据比较了时，就可 以在此处插入当前数据项。
	 * 
	 */
	public static final void insertionSort(int[] srcs) {
		if (srcs == null || srcs.length == 0) {
			return;
		}

		for (int i = 1; i < srcs.length; i++) {

			int currentValue = srcs[i];
			int position = i;

			while (srcs[position - 1] > currentValue && position > 0) {

				srcs[position] = srcs[position - 1];
				position = position - 1;

			}

			srcs[position] = currentValue;
		}

		for (int i = 0; i < srcs.length; i++) {
			System.out.println(srcs[i] + " ");
		}
	}

	// 希尔排序
	/**
	 * 希尔排序有时又叫做 “缩小间隔排序”，它以插入排序为基础，将原来要排序的列表划分为一些子列表，再对每一个子列表执行插入排序，
	 * 从而实现对插入排序性能的改进。划分子列的特定方法是希尔排序的关键。我们并不是将原始列表分成含有连续元素的子列，而是确定一个 划分列表的增量
	 * “i”，这个i更准确地说，是划分的间隔。然后把每间隔为i的所有元素选出来组成子列表，然后对每个子序列进行插入排 序，最后当 i=1
	 * 时，对整体进行一次直接插入排序。
	 */
	public static final void shellSort(int[] srcs) {
		if (srcs == null || srcs.length == 0) {
			return;
		}

		// 增量gap，并逐步缩小增量
		for (int gap = srcs.length / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < srcs.length; i++) {
				int j = i;
				int temp = srcs[j];
				if (srcs[j] < srcs[j - gap]) {
					while (j - gap >= 0 && temp < srcs[j - gap]) {
						srcs[j] = srcs[j - gap];
						j -= gap;
					}
					srcs[j] = temp;
				}
			}
		}

		for (int i = 0; i < srcs.length; i++) {
			System.out.println(srcs[i] + " ");
		}

	}

	// 快速排序
	/**
	 * 快速排序由 C. A. R. Hoare 在1962年提出。它的基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，
	 * 其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排序，整个排序过程
	 * 可以递归进行，以此达到整个数据变成有序序列。
	 * 
	 * 思想:1.在待排序的元素任取一个元素作为基准(通常选第一个元素，但最的选择方法是从待排序元素中随机选取一个作为基准)，称为基准元素；
	 * 
	 * 2.将待排序的元素进行分区，比基准元素大的元素放在它的右边，比其小的放在它的左边；
	 * 
	 * 3.对左右两个分区重复以上步骤直到所有元素都是有序的。
	 */
	public static final void quickSort(int arr[],int _left,int _right) {

		int left = _left;
        int right = _right;
        int temp = 0;
        if(left <= right){   //待排序的元素至少有两个的情况
            temp = arr[left];  //待排序的第一个元素作为基准元素
            while(left != right){   //从左右两边交替扫描，直到left = right

                while(right > left && arr[right] >= temp)  
                     right --;        //从右往左扫描，找到第一个比基准元素小的元素
                  arr[left] = arr[right];  //找到这种元素arr[right]后与arr[left]交换

                while(left < right && arr[left] <= temp)
                     left ++;         //从左往右扫描，找到第一个比基准元素大的元素
                  arr[right] = arr[left];  //找到这种元素arr[left]后，与arr[right]交换

            }
            arr[right] = temp;    //基准元素归位
            quickSort(arr,_left,left-1);  //对基准元素左边的元素进行递归排序
            quickSort(arr, right+1,_right);  //对基准元素右边的进行递归排序
        }        
        for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}
}
