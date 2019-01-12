/** 
 * Lab 15
 * @author erictikhonov
 */
public class SandwichTest {

	public static void main(String[] args) {
		
		Sandwich application = new Sandwich();
		
		// printing hamburger palace sign
		application.printHamburgerPalaceSign();
		
		// asking for number of sandwiches
		System.out.print("How many hamburgers do you want? ");
		// getting number of Sandwiches
		application.getNumOfHamburgers();
		
		// printing hamburgers
		application.printHamburgers();
		
		System.out.print("Thank you for ordering!");

	}

}
