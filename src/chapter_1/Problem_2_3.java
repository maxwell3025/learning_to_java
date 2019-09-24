package chapter_1;

public class Problem_2_3 {

	public static void main(String[] args) {
	String s = ("Call me Ishhamel");
	System.out.print(s);
	StringBuffer buffer = new StringBuffer(s);
	System.out.print(", The length is " + buffer.length());
	System.out.print(", the first letter is " + buffer.charAt(0));
	System.out.print(", The last letter is " + buffer.charAt(buffer.length()-1));
	}

}
