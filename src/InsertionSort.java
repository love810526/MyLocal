
public class InsertionSort {
	public static void main(String[] args) {
		int[] array = { 11, 47, 79, 50, 63, 38, 89, 93, 87, 22 };
		int[] result = insertionSort(array);
		int[] resultDesc = insertionSortDesc(array);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ",");
		}
	}

	// 遞增
	public static int[] insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			final int temp = array[i];
			int j = i - 1;
			while (j >= 0 && temp < array[j]) {
				array[j + 1] = array[j--];
			}
			array[j + 1] = temp;
		}
		return array;
	}

	public static int[] insertionSortDesc(final int[] array) {
		for (int i = 1; i < array.length; ++i) {
			final int temp = array[i];

			int j = i - 1;

			while (j >= 0 && temp > array[j]) {
				array[j + 1] = array[j--];
			}

			array[j + 1] = temp;
		}
		return array;
	}
}
