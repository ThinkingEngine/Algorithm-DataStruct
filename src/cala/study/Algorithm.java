package cala.study;

/**
 * �㷨ѧϰ
 */
public class Algorithm {

	// ð���㷨
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
}
