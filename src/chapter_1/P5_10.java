package chapter_1;

public class P5_10 {

	static double pow(double number, int power) {
		double original = number;
		for (int i = 0; i < power; i++) {
			number = number * original;
		}
		return number / original;
	}

	public static void main(String[] args) {
		int size = 6;
		for (int x = 1; x <= size; x++){
			for (int y = 1; y <= size; y++) {
				System.out.print(pow(x, y) + "\t");
			}
		System.out.println();
		}
	}

}
