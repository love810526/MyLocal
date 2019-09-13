
public class Sum {
	public static void main(String[] args) {
		int n = 6;
		int result = sum(n);
		System.out.println(result);
		int result1 = sumRecursive(n);
		System.out.println(result1);
	}
	// loop
	public static int sum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	// recursive
	public static int sumRecursive(int n) {

		if (n < 1) {
			return 0;
		} else {
			return n + sumRecursive(n-1);
		}
	}

}
