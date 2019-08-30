
public class BinarySearch {
	public static void main(String[] Args) {
		int[] array = { 5, 17, 33, 41, 55, 61, 80 };
		int find = 55;
		int result = binarySearch(array, find);
		System.out.println("this number:" + find + " in index:" + result);
		int resultByloop = binarySearchLoop(array, find);
		System.out.println("Loop find this number:" + find + " in index:" + resultByloop);
	}

	public static int binarySearch(int[] array, int find) {
		return binarySearchRecursively(array, find, 0, array.length - 1);
	}

	// 遞迴解法 Recursive
	public static int binarySearchRecursively(int[] arr, int find, int start, int end) {
		final int middle = (start + end) / 2;
		final int element = arr[middle];
		if (element == find) {
			return middle;
		} else if (start == end) {
			return -1;
		} else {
			if (find > element) {
				return binarySearchRecursively(arr, find, middle + 1, end);
			} else {
				return binarySearchRecursively(arr, find, start, middle - 1);
			}
		}
	}

	// loop 解法
	public static int binarySearchLoop(int[] array, int find) {
		int start = 0;
		int end = array.length - 1;

		while (end >= start) {
			int middle = (start + end) / 2;
			int element = array[middle];
			if (element == find) {
				return middle;
			} else {
				if (find > element) {
					start = middle + 1;
				} else {
					end = middle - 1;
				}
			}
		}
		return -1;
	}
}
