import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OddOccurrencesInArray {
	public static int solution(int[] A) {
		List<Integer> pairs = new ArrayList<>();

		for (int number : A) {
			if (pairs.contains(number)) {
				pairs.remove(pairs.indexOf(number));
			} else {
				pairs.add(number);
			}
		}

		return pairs.get(0);
	}

	public static int solution2(int[] A) {
		Set<Integer> result = new HashSet<>();
		for (int number : A) {
			if (result.contains(number)) {
				result.remove(number);
			} else {
				result.add(number);
			}

		}
		int finalOutput = SetToInt(result);

		return finalOutput;
	}

	private static int SetToInt(Set<Integer> allSet) {
		// 先将set集合转为Integer型数组
		Integer[] temp = allSet.toArray(new Integer[] {});// 关键语句

		// 再将Integer型数组转为int型数组
		int[] intArray = new int[temp.length];
		for (int i = 0; i < temp.length; i++) {
			intArray[i] = temp[i].intValue();
		}
		int convert = 0;
		for (int f = 0; f < intArray.length; f++) {
			convert = intArray[f];
		}
		return convert;
	}

	public static void main(String[] args) {
		int[] inputArr = { 9, 3, 9, 3, 9, 7, 9 };
		int result = solution2(inputArr);
		System.out.println("result: " + result);
	}
}
