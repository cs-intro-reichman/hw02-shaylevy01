/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0];
		int length = str.length();
		String reverse = "";
		for (int i = length-1 ; i >= 0 ; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
		char middle = reverse.charAt(length / 2);
		System.out.println("The middle character is " + middle);
	}
}
