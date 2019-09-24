package chapter_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3_17 {

	public static void main(String[] args) throws Exception {
		int amount = 0;
		Boolean mistake = true;
		int[] days = new int[12];
		days[0] = 31;
		days[1] = 28;
		days[2] = 31;
		days[3] = 30;
		days[4] = 31;
		days[5] = 30;
		days[6] = 31;
		days[7] = 31;
		days[8] = 30;
		days[9] = 31;
		days[10] = 30;
		days[11] = 31;
		String[] month = new String[12];
		month[0] = "January";
		month[1] = "February";
		month[2] = "March";
		month[3] = "April";
		month[4] = "May";
		month[5] = "June";
		month[6] = "July";
		month[7] = "August";
		month[8] = "September";
		month[9] = "October";
		month[10] = "November";
		month[11] = "December";
		String m = "";
		int i = 0;
		int day = 0;

		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);

		while (mistake) {
			if(amount>4){
				System.out.print("we do not condone alcohol abuse: ");
			}
			else{
			System.out.print("Enter the month: ");
			}
			m = input.readLine();
			for (int x = 0; x < 12; x++) {
				if (m.equals(month[x])) {
					i = x;
					mistake = false;
				}
			}
			if (!mistake) {
				System.out.println("You entered " + month[i]);
				System.out.println("The abbreviation is "
						+ month[i].substring(0, 3).toUpperCase());
				System.out.println("The month number is " + (i + 1));
				System.out.println("the amount of days in the month are "
						+ days[i] + " days");
			} else {
				System.out
						.println("you either typed the month in wrong or didn't capitalize it");
				amount++;
			}
		}

	}
}
