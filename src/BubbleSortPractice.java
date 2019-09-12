
public class BubbleSortPractice {
	public static void main(String[] args) {
		int[] input = { 69, 81, 30, 38, 9, 2, 47, 61, 32, 79 };
		int[] output = bubble(input);
		for (int i : output) {
			System.out.print(i + ",");
		}
		System.out.println("");
		int[] outputDesc = bubbleDesc(input);
		for (int i : outputDesc) {
			System.out.print(i + ",");
		}

	}

	// 遞增
	private static int[] bubble(int[] input) {
		boolean isChanged = true;
		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input.length - 1; j++) {
				// 比大小,前>後 換位
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;

					isChanged = false; // 交換位置後就設定為false
				}
			}
			if (isChanged) {
				break;
			}
		}
		return input;
	}
	// 遞減
	private static int[] bubbleDesc(int[] input) {
		boolean isChanged = true;
		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input.length - 1; j++) {
				// 比大小,前>後 換位
				if (input[j] < input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;

					isChanged = false; // 交換位置後就設定為false
				}
			}
			if (isChanged) {
				break;
			}
		}
		return input;
	}
}
