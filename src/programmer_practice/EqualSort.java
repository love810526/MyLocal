/*
 * 撰寫方法判斷兩個字串時否有一個是另外的排列組合
 * */

package programmer_practice;

import java.util.Arrays;

public class EqualSort {
	public static void main(String[] Args) {
		String str1 = "dog";
		String str2 = "dog";
		boolean isEqualSort = isEqualSort(str1, str2);
		System.out.println("isEqualSort: " + isEqualSort);
	}

	public static boolean isEqualSort(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		if (sort(str1).equals(sort(str2))) {
			return true;
		} else {
			return false;
		}
	}

	public static String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
}
