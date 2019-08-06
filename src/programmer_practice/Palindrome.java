package programmer_practice;

public class Palindrome {
	public static void main(String[] Args) {
		String input = "abccdba";
		boolean isPalindrome = isPalindrome(input);
		System.out.println("input is Palindrome : " + isPalindrome);
	}

	public static boolean isPalindrome(String text) {
		String clean = text.replaceAll("\\s+", "").toLowerCase(); // 可以先過濾空格
		int length = clean.length();
		int forward = 0;
		int backward = length - 1;
		while (backward > forward) {
			char forwardChar = clean.charAt(forward++);
			char backwardChar = clean.charAt(backward--);
			if (forwardChar != backwardChar)
				return false;
		}
		return true;
	}
}
