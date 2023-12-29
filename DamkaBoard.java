/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String line = "";
		for (int i=1 ; i<=n ; i++) {
			for (int j=1 ; j<=n ; j++) {
				if (i % 2 == 0) {
					line = line + " *";
				} else {
					line = line + "* ";
				}
			}
			System.out.println(line);
		}
	}
}
