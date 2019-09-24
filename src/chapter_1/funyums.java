package chapter_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class funyums {

	public static void main(String[] args) throws Exception {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.print("Enter the name: ");
		String text = input.readLine();
		text = text.toLowerCase();
		StringBuffer buf = new StringBuffer(text);
		int spaces = 0;
		for (int i = 1; i <= buf.length()-1; i++) {
			if (buf.charAt(i) == ' ') {

				spaces = i + 1;
			}

		}
		String result = buf.toString();
		char[] thing = result.toCharArray();
		thing[0] = Character.toUpperCase(thing[0]);
		thing[spaces] = Character.toUpperCase(thing[spaces]);
		System.out.print(thing);
	}
}
