package chapter_1;

import java.util.Random;

public class Methods {
	public static void main(String[] args) throws InterruptedException{
		Random xr = new Random();
		Random yr = new Random();
		while(1==1){
		int xb = xr.nextInt(20);
		int yb = yr.nextInt(20);
		System.out.println("The minimum of " + xb + " and " + yb + " is " + min(xb,yb));
		Thread.sleep(250);
		}
	}
	static int min(int x, int y) {
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}
}
