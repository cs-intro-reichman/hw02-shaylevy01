/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
		int sum = 0;
		String eq = " = 1";
		for (int d = 1 ; d<N ; d++) {
			if (N % d == 0) {
				sum = sum + d;
				if (d != 1){
					eq = eq + " + " + d;
				}
			}
		}
		if (N == sum) {
			System.out.println(N + " is a perfect number since " + N + eq);
		} else {
			System.out.println(N + " is not a perfect number");
		}
	}
}
