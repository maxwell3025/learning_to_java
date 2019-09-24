package chapter_1;

import java.util.Random;

public class P3_15 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] bob = new int[4];
		bob[0]=r.nextInt(100);
		bob[1]=r.nextInt(100);
		bob[2]=r.nextInt(100);
		bob[3]=r.nextInt(100);
		System.out.println("maximum="+Math.max(Math.max(bob[0], bob[1]), Math.max(bob[2], bob[3])));
		System.out.println("minimum="+Math.min(Math.min(bob[0], bob[1]), Math.min(bob[2], bob[3])));
	}

}
