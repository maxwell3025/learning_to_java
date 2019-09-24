package chapter_1;

import java.util.Random;

public class P3_13 {

	public static void main(String[] args) {
		Random blob = new Random();
		int y = blob.nextInt(200)-100;
		System.out.println(y);
		if(y<0){
			System.out.println("negative");
		}
		else{
			System.out.println("positive");
		}
	}

}
