import java.util.Scanner;

public class Fibonacci {
	private static int[] rel = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };

	public static void main(String[] args) {
		int number = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		number = scanner.nextInt();
		int loop = calculate(number);
		int result = recursive(number);
		System.out.println("Result loop:" + loop);
		System.out.println("Result recursive:" + result);

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
	
	public static int recursive(int n) {
		if (n < 0) {
			return 0;
		}
		return (n==0 || n==1) ? 1 : ( recursive(n-1) + recursive(n-2) );
	}

}
