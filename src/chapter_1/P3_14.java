package chapter_1;

import java.util.Random;

public class P3_14 {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(Math.max(r.nextInt(100), r.nextInt(100)));
	}

}
