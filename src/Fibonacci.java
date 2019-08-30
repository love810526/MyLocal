import java.util.Scanner;

public class Fibonacci {
	private static int[] rel = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };

	public static void main(String[] args) {
		int number = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		number = scanner.nextInt();

		int result = calculate(number);
		System.out.println("Result:" + result);

	}

	public static int calculate(int n) {
		if (rel.length <= n) {
			int[] tt = new int[n + 1];
			int i;
			for (i = 0; i < rel.length; i++) {
				tt[i] = rel[i];
			}
			for (; i <= n; i++) {
				tt[i] = tt[i - 1] + tt[i - 2];
			}
			rel = tt; 
		}
		return rel[n];
	}

}
