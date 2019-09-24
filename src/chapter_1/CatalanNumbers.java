package chapter_1;

public class CatalanNumbers {
	public static void main(String[] args) {
		for (int i = 0; i < 200; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
	}

	static boolean isPrime(int n) {
		if (n < 2)
			return false;

		if (n == 2)
			return true;

		if (n % 2 == 0)
			return false;

		for (int d = 3; d < Math.sqrt(n); d += 2)
			if (n % d == 0)
				return false;

		return true;

	}
}
