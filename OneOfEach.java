
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		double random;
		boolean isGirl = false;
		boolean isBoy = false;
		String children = "";
		int num = 0;
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
		System.out.println(children);
		System.out.println("You made it... and you now have " + num + " children.");
	}
}
