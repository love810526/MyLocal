
public class ArrayReverse {
	public static void main(String[] Args) {
		String input = "Winnie";
		String reverseToString = reverseToString(input);
		System.out.println("[reverseToString] Result: " + reverseToString);
	}
	
	// reverse String
	public static String reverseToString(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}
		return output;
	}
	
	

}
