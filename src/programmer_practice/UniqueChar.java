package programmer_practice;
/*
 * 實作一個演算法來判斷字串的所有字元是否unique 
 */
public class UniqueChar {
	public static void main(String[] Args) {
		String input = "ac";
		boolean result = isUniqueChars(input);
		System.out.println("Char is unique: " + result);
	}

	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] charSet = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int value = str.charAt(i);		
			if (charSet[value]) {
				return false;
			}
			charSet[value] = true;
		}
		return true;
	}
}
