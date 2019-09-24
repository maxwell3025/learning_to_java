package chapter_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Telephone_problem {

	public static void main(String[] args) throws IOException {
		InputStreamReader telephone_number = new InputStreamReader(System.in);
		BufferedReader telephone_buffer = new BufferedReader(telephone_number);
		boolean valid = true;
		boolean cont = true;
		while (cont) {
			System.out.print("Enter your telephone number:");
			String t = telephone_buffer.readLine();
			System.out.println(" ");
			
		for (int i=0; i<=9; i++ ){
			String testchar = String.valueOf(t.charAt(i));
			try {
				Integer.parseInt(testchar);}
				catch(NumberFormatException e){
					valid=false;
				}
		}
			String telephone_hold = new String(t);
			if (t.length() == 10 && valid) {
				String code = t.substring(0, 3);
				String exchange = t.substring(3, 6);
				String number = t.substring(6);
				System.out.println("(" + code + ") " + exchange + "-" + number);
			} else {
				System.out.println("invalid phone number, idiot!!!");
			}
			System.out
					.println("Continue?(enter in 'c' to continue or somthing else to stop.)");
			String con = telephone_buffer.readLine();
			if (con.equalsIgnoreCase("c")) {
				valid = true;
				cont = true;
				System.out.println("executed");
			} else {
				cont = false;
				System.out.print("bye");
			}
		}

	}
}
