package chapter_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class helloworld {
public static void main(String[] args) throws IOException {
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader input = new BufferedReader(reader);
	System.out.print("Enter your first name: ");
	String first_name = input.readLine();
	System.out.print("Enter your last name: ");
	String last_name = input.readLine();
	System.out.println("Hello," + first_name + " " + last_name + "!");

}
}
