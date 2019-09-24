package chapter_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class funnyyumm {

	public static void main(String[] args) throws Exception {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.print("Enter the name: ");
		String text = input.readLine();
		StringBuffer buf = new StringBuffer(text);
		int spaces = 0;
		int space2 = 0;
		boolean spaced = true;
		for (int i = 1; i <= buf.length() - 1; i++) {
			if (buf.charAt(i) == ' '&&spaced) {

				spaces = i;
				spaced=false;
			}
			else if (buf.charAt(i) == ' ') {

				space2 = i;
			}

		}
		String result = buf.toString();
		result=result.substring(space2, result.length())+", "+result.substring(0, spaces)+" "+result.charAt(spaces+1)+".";
		
		System.out.print(result);
	}
}
