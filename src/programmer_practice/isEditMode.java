package programmer_practice;

public class isEditMode {
	public static void main(String[] Args) {
		String str1 = "pale";
		String str2 = "pgale";
		boolean oneEditWay = oneEditWay(str1, str2);
		System.out.println("is one Edit Way: " + oneEditWay);
	}

	public static boolean oneEditWay(String str1, String str2) {
		if (str1.length() == str2.length()) {
			return isReplace(str1, str2);
		} else if (str1.length() + 1 == str2.length()) {
			return isInsert(str1, str2);
		} else if (str1.length() - 1 == str2.length()) {
			return isInsert(str2, str1);
		}
		return false;
	}

	public static boolean isReplace(String str1, String str2) {
		System.out.println("Check is one edit to Replace Start ...");
		boolean isDiffernce = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				if (isDiffernce) {
					return false;
				}
				isDiffernce = true;
			}
		}
		return isDiffernce;
	}

	public static boolean isInsert(String str1, String str2) {
		System.out.println("Check is one edit to Insert / Delete Start ...");
		// 檢查是否插入一個字元後s1會變成s2
		int index1 = 0;
		int index2 = 0;
		while (index2 < str2.length() && index1 < str1.length()) {
			if (str1.charAt(index1) != str2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}
	/*
	 * 錯誤寫法 這個適合在找頭尾插入的時候使用 public static boolean isInsert(String str1, String str2)
	 * { if (str1.length() > str2.length()) { if (str1.contains(str2) &&
	 * str1.length() - 1 == str2.length()) { return true; } else { return false; } }
	 * else { if (str2.contains(str1) && str2.length() - 1 == str1.length()) {
	 * return true; } else { return false; } } }
	 */
}
