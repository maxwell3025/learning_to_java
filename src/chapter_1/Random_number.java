package chapter_1;

import java.io.IOException;
import java.util.Random;

public class Random_number {
public static void main(String[] args) throws IOException{
	Random random = new Random();
	int mlg = 100;
	int randomness = random.nextInt(mlg);
	System.out.println(randomness);
	randomness = random.nextInt(mlg);
	System.out.println(randomness);
	randomness = random.nextInt(mlg);
	System.out.println(randomness);
	randomness = random.nextInt(mlg);
	System.out.println(randomness);
	randomness = random.nextInt(mlg);
	System.out.println(randomness);
	randomness = random.nextInt(mlg);
	System.out.println(randomness);
	randomness = random.nextInt(mlg);
	System.out.println(randomness);
	randomness = random.nextInt(mlg);
	System.out.println(randomness);
	randomness = random.nextInt(mlg);
	System.out.println(randomness);
}
}
