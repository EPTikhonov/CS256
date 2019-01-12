/** 
 * Lab 15
 * @author erictikhonov
 */
import java.util.Scanner;
public class Sandwich {

	// Create a Scanner object for user input
	Scanner input = new Scanner(System.in);
	private int lettuce;
	private int tomatoes;
	private int numOfHamburgers;

	// Constructor
	public Sandwich() {

	}

	// Print the Hamburger Palace sign
	public void printHamburgerPalaceSign() {
		System.out.println("******************************");
		// made into for loop instead of while
		for (int line = 0; line < 5; line++) {
			System.out.println("*                            *");
		}

		System.out.println("* Hamburger Palace           *");
		// made into for loop instead of while
		for (int line2 = 0; line2 < 5; line2++) {
			System.out.println("*                            *");
		}

		System.out.println("******************************\n");

	}

	// getting input for hamburger
	public void getNumOfHamburgers() {
		this.numOfHamburgers = input.nextInt();
	}

	// printing all hamburgers
	public void printHamburgers() {

		// Print number of hamburgers from input
		for (int i = 1; i <= this.numOfHamburgers; i++) {
			System.out.println("Hamburger #"+i+":");
			
			// Ask how much of lettuce the user wants (reject negative numbers)
				System.out.print("How many layers of lettuce do you want? ");
				lettuce = input.nextInt();
				if (lettuce < 0) {
					System.out.print("How many layers of lettuce do you want? ");
					lettuce = input.nextInt();
				}

			// Ask how much of tomatoes the user wants (reject negative numbers)
				System.out.print("How many layers of tomatoes do you want? ");
				tomatoes = input.nextInt();
				if (tomatoes < 0) { 
					System.out.print("How many layers of tomatoes do you want? ");
					tomatoes = input.nextInt();
				}

			// Top bun
			System.out.println("Here's your hamburger! \n");
			System.out.println("(_________)");

			// Printing lettuce
			for (int x = 1; x <= lettuce; x++) {
				System.out.println(" ~~~~~~~~~");
			}

			// Printing tomatoes
			for (int y = 1; y <= tomatoes; y++) {
				System.out.println(" [  ] [  ]");
			}

			// Bottom bun
			System.out.println(" *********");
			System.out.println("(_________) \n");

		}

		// Closing scanner input
		input.close();
	}

}
