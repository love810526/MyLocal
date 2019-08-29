
public class SelectionSort {
	public static void main(String[] args) {
		int[] array = { 41, 33, 17, 80, 61, 5, 55 };
		array = selectionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println("");
		for (int i = 0; i < selectionSortDesc(array).length; i++) {
			System.out.print(selectionSortDesc(array)[i] + ",");
		}

	}

	// 遞增排序
	public static int[] selectionSort(int[] array) {
		final int length = array.length;
		final int lengthDec = length - 1;

		for (int i = 0; i < lengthDec; i++) {
			int p = i;
			for (int j = i + 1; j < length; j++) {
				if (array[p] > array[j]) {
					p = j;
				}
			}
			if (i != p) {
				int temp = array[i];
				array[i] = array[p];
				array[p] = temp;
			}
		}
		return array;
	}

	// 遞減排序
	public static int[] selectionSortDesc(int[] array) {
		final int length = array.length;
		final int lengthDec = length - 1;

		for (int i = 0; i < lengthDec; i++) {
			int p = i;
			for (int j = i + 1; j < length; j++) {
				if (array[p] < array[j]) {
					p = j;
				}
			}
			if (i != p) {
				int temp = array[i];
				array[i] = array[p];
				array[p] = temp;
			}
		}
		return array;
	}
}
