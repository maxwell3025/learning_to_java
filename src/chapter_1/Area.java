package chapter_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Area {

	public static void main(String[] args) throws Exception {
InputStreamReader reader = new InputStreamReader(System.in);
BufferedReader input = new BufferedReader(reader);
System.out.print("Enter the radius: ");
String text = input.readLine();
Double x = new Double(text);
double r = x.doubleValue();
System.out.println("The area of a circle of radius " + r);
double area = Math.PI*r*r;
System.out.println("is " + area);
	}

}
