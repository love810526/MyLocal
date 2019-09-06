import java.util.HashSet;

public class FirstRepeat {
	public static void main(String[] args) {
		String input = "qywyer23tdd";
		int length = input.length();
		String result = findFirstRepeat(input, length);
		System.out.println("Output: "+ result);
		System.out.println(findFirstRepeatToChar(input,length));
	}
	
	// 這個可以拿來找出所有的重複 / 最後一個重複 
	public static String findFirstRepeat(String input, int n) { 
		char[] inputArr = input.toCharArray();
		String output = "";
		HashSet store = new HashSet<>();
		for(int i =0; i< inputArr.length; i++) {
			if(store.contains(inputArr[i])) {
				output = String.valueOf(inputArr[i]);
				return output;
			}else {
				store.add(inputArr[i]);
			}
		}
		return null;
	}
	
	public static char findFirstRepeatToChar(String input, int n) {
		char[] inputArr = input.toCharArray();
		HashSet store = new HashSet<>();
		for(int i =0; i< inputArr.length; i++) {
			if (!store.add(inputArr[i])) {
				return inputArr[i];
			}
		}
		return 0;
	}
}
