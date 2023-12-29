/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		double sum = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for (int i=0; i<T ; i++) {
			int num = 0;
			double random;
			boolean isGirl = false;
			boolean isBoy = false;
			String children = "";
			do {
				random  = (Math.random());
				if (random < 0.5) {
					isBoy = true;
					children = children + "b ";
					num++;
				} else {
					if (random > 0.5) {
						isGirl = true;
						children = children + "g ";
						num++;
					}
				}
			} while (isGirl != true || isBoy != true);
			if (num == 2) {
				count2++;
			} else {
				if (num == 3) { 
					count3++;
				} else {
						count4++;						
				}
			}
			sum = sum + num;
		}
		double avg = sum/T;
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + count2);
		System.out.println("Number of families with 3 children: " + count3);
		System.out.println("Number of families with 4 children: " + count4);
		int mostCommon = 0;
		if (count2 >= count3 && count2 >= count4) {
			System.out.println("The most common number of children is 2.");
		} else {
			if (count3 >= count2 && count3 >= count4) {
				System.out.println("The most common number of children is 3.");
			} else {
				System.out.println("The most common number of children is 4 or more");
			}
		}
	}
}
