
public class BinaryGap {
	public static int solution(int N) {
		String binaryNum = Integer.toBinaryString(N);
		binaryNum = binaryNum.replace("1", "#1#");
		String[] binaryArr = binaryNum.split("1");

		int maxCount = 0;
		for (int i = 0; i < binaryArr.length; i++) {
			String filterString = binaryArr[i];
			int checkCount = 0;

			if (filterString.length() > 2 && filterString.startsWith("#") && filterString.endsWith("#")) {
				filterString = filterString.replace("#", "");
				checkCount = filterString.length();
			}
			if (maxCount < checkCount) {
				maxCount = checkCount;

			}

		}
		return maxCount;
	}

	public static void main(String[] args) {
		int inputNum = solution(1041);
		System.out.println("inputNum: " + inputNum);
	}
}
