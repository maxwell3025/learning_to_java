package chapter_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Digit_extractor {

	public static void main(String[] args) throws IOException {
		InputStreamReader read_crap = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(read_crap);
		System.out.print("Enter the number into the extracto-bot 9000 here:");
		String raw_number = input.readLine();
		int n = Integer.parseInt(raw_number);
		System.out.print(" the thousandths digit is " + n / 1000);
		n %= 1000;
		System.out.print(" the hundredths digit is " + n / 100);
		n %= 100;
		System.out.print(" the tenths digit is " + n / 10);
		n %= 10;
		System.out.print(" the ones digit is " + n / 1);
		n %= 1;
	}

}
