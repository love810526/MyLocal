
public class Gcd {
	public static void main(String[] args) {
		int a = 27;
		int b = 18;
		int gcdByRecursive = gcdByRecursive(a, b);
		System.out.println("result recursive:" + gcdByRecursive);
		int gcdByLoop = gcdByLoop(a, b);
		System.out.println("result loop:" + gcdByLoop);
	}

	public static int gcdByRecursive(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return gcdByRecursive(b, a % b);
		}
	}

	public static int gcdByLoop(int p, int q) {
		int tmp;
		while (p % q != 0) {
			tmp = q;
			q = p % q;
			p = tmp;
		}
		return q;
	}

}
