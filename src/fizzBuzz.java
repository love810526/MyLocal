/**
 * https://leetcode.com/problems/fizz-buzz/
 * **/
import java.lang.reflect.Array;
import java.util.*;

public class fizzBuzz {
	public static void main(String[] Args) {
		int count = 15;
		String words = "FizzBuzz";
		String forThree = words.substring(0, 4);
		String forFive = words.substring(4, 8);
		List<String> result = new ArrayList<String>();
		System.out.println(forThree);
		System.out.println(forFive);
		for (int i = 1; i <= count; i++) {
			String num = Integer.toString(i);
			if (i % 3 == 0 && i % 5 == 0) {
				result.add(words);
			} else if (i % 5 == 0) {
				result.add(forFive);
			} else if (i % 3 == 0) {
				result.add(forThree);
			} else {
				result.add(num);
			}
		}
		System.out.println(result);
	}
}
