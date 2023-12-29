/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int random1 = (int) (Math.random() * 11);
		String seq = "" + random1;
		int random2;
		do {
			random2 = (int) (Math.random() * 11);
			if (random2 < random1){
				break;
			}
			seq = seq + " " + random2;
			random1 = random2;
		} while (random1 >= random2); 
		System.out.println(seq);
	}
}
