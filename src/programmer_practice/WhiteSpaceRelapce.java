package programmer_practice;

/*
 * 撰寫方法將字串中的空白以‘%20’替換，你可以假設字串後面有足夠的空間保存增加的字元，且有真正的字串長度（使用String Array)
 * */
public class WhiteSpaceRelapce {
	public static void main(String[] Args) {
		String input = "Mr John Smith     ";
		int length = 13;
		String result = replaceWhiteSpace(input.toCharArray(), length);
		System.out.println("result: " + result);

	}

	public static String replaceWhiteSpace(char[] str, int truelength) {
		int countSpace = 0;
		for (int i = 0; i < truelength; i++) {
			if (str[i] == ' ') {
				countSpace++;
			}
		}
		int index = truelength + countSpace * 2;
		System.out.println("index" + index);
		if (truelength < str.length)
			str[truelength] = '\0'; // 字串陣列結束

		for (int j = truelength - 1; j >= 0; j--) {
			if (str[j] == ' ') {
				System.out.println(str[index - 1]);
				System.out.println(str[index - 2]);
				System.out.println(str[index - 3]);
				str[index - 1] = '%';
				str[index - 2] = '2';
				str[index - 3] = '0';
				index = index - 3;
			} else {
				str[index - 1] = str[j];
				System.out.println(">>>>>" + str[index - 1]);
				index--;
			}
		}
		return new String(str);
	}
}
