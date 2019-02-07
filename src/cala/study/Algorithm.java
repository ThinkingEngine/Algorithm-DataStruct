package cala.study;

/**
 * �㷨ѧϰ
 */
public class Algorithm {

	// ð���㷨
	/**
	 * ð������Ҫ��һ���б����ظ���������Ҫ�Ƚ����ڵ�������ҽ���˳���Ŵ���ÿ�� �б�ʵ��һ�α���������һ���������������ȷ��λ�á�
	 * �����Ͻ����б��ÿһ����������� ����Ӧ��λ�� ��ð�ݡ�������б��� n ���һ�α�����Ҫ�Ƚ� n-1 �����ݡ���Ҫע�⣬һ���� �������
	 * (���չ涨��ԭ�����С)�����������Ƚϵ����ݶ��е�һ�������ͻ������б�һֱ ���ƣ�ֱ����α���������
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

	// ѡ������
	/**
	 * ѡ�����������ð����������ܣ���ÿ����һ���б�ֻ����һ�����ݣ�������һ�α���ʱ�� ���������ɱ������ٰ���������ȷ��λ�á�
	 * ��ð������һ������һ�α����������� ������ѹ�λ���ڶ��α���ʹ�δ����λ��������̳������У�һ����Ҫ n-1 �α������ź� n ���� �ݣ�
	 * ��Ϊ���һ�����ݱ����ڵ� n-1 �α���֮����ܹ�λ��
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

	// ��������
	/**
	 * ����������㷨���Ӷ���Ȼ�� O(n^2)�����乤��ԭ�����в�ͬ�������Ǳ���һ��λ�ÿ�ǰ�� ���źõ��ӱ�Ȼ��ÿһ���µ������ �����롱
	 * ��ǰ�ߵ��ӱ���źõ��ӱ�����һ�������Ϊֻ����һ����������б����Ѿ��źõġ�ÿ�ź���һ�����ݣ��� 1 ��ʼ�� n-1���� ��
	 * �������ݻ�����ź��ӱ��е����ݱȽϡ��Ƚ�ʱ�����ǰ�֮ǰ�Ѿ��źõ��б��б�������ݴ���Ƶ������ұߡ����ӱ�����С�ڵ�ǰ���ݣ�
	 * ���ߵ�ǰ�����Ѿ����ӱ���������ݱȽ���ʱ���Ϳ� ���ڴ˴����뵱ǰ�����
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

	// ϣ������
	/**
	 * ϣ��������ʱ�ֽ��� ����С������򡱣����Բ�������Ϊ��������ԭ��Ҫ������б���ΪһЩ���б��ٶ�ÿһ�����б�ִ�в�������
	 * �Ӷ�ʵ�ֶԲ����������ܵĸĽ����������е��ض�������ϣ������Ĺؼ������ǲ����ǽ�ԭʼ�б�ֳɺ�������Ԫ�ص����У�����ȷ��һ�� �����б������
	 * ��i�������i��׼ȷ��˵���ǻ��ֵļ����Ȼ���ÿ���Ϊi������Ԫ��ѡ����������б�Ȼ���ÿ�������н��в����� ����� i=1
	 * ʱ�����������һ��ֱ�Ӳ�������
	 */
	public static final void shellSort(int[] srcs) {
		if (srcs == null || srcs.length == 0) {
			return;
		}

		//����gap��������С����
		for (int gap = srcs.length / 2; gap > 0; gap /= 2) {
			//�ӵ�gap��Ԫ�أ�����������������ֱ�Ӳ����������
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
}
