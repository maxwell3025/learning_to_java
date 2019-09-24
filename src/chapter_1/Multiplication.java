package chapter_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication {
	public static void main(String[] args) throws IOException,
			InterruptedException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.print("enter the size:");
		String sizeraw = input.readLine();
		int size = Integer.parseInt(sizeraw);

		int square = size * size;
		String squaredigit = String.valueOf(square);
		int digit = squaredigit.length();
		int x = 0;
		for (int z = 1; z <= size; z++) {
			for (int y = 1; y <= size * z; y = y + z) {
				x = x + z;
				System.out.print(x);
				System.out.print(" ");
				if (x < 1000) {
					System.out.print(" ");

					if (x < 100) {
						System.out.print(" ");

						if (x < 10) {
							System.out.print(" ");
						}
					}
				}
				Thread.sleep(2000 / square);
			}
			x = 0;
			System.out.println();
		}
	}
}
