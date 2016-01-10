/**
	 * This is a class that tests the Card class.
	 */
	public class CardTester {

		/**
		 * The main method in this class checks the Card operations for consistency.
		 *	@param args is not used.
		 */
		public static void main(String[] args) {
			Card one = new Card("Three", "Spades", 3);
			Card two = new Card("Two", "Hearts", 2);
			Card three = new Card("Three", "Spades", 3);
			Card four = new Card("Six", "Clubs", 6);
			
			System.out.println(one.rank());
		}
	}

