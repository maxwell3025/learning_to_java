package chapter_1;

public class While_Statement_Test {
	public static void main(String[] args) throws InterruptedException {
int n = 0;
		
		while(n<100){
			n=n+1;
			System.out.print(n+" ");
			Thread.sleep(75);
		}
	}

}
