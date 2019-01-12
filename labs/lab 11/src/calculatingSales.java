/** 
 * Lab 11; Problem #5.17 in Deitel
 * @author erictikhonov
 */
import java.util.*;

public class calculatingSales {

	private Scanner input = new Scanner(System.in);
	private int productNumber;
	private int quantity;
	private double total = 0.0;

	public void inputProducts() {

		System.out.printf("%s\n%s\n   %s\n   %s\n",
				"Enter the integer product in the range 1-5 and its integer quantity on each line.",
				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> d then press enter.",
				"On Windows type <Ctrl> z then press enter.\n");

		System.out.print("Enter product number (1-5) and quantity: ");

		// getting two inputs (productNumber and quantity)
		while (input.hasNext()) {
			System.out.print("Enter product number (1-5) and quantity: ");

			productNumber = input.nextInt();
			quantity = input.nextInt();

			// checking if input is negative
			if ((productNumber <= 0) || (quantity <= 0)) {
				productNumber = 0;
				quantity = 0;
				System.out.println("Please enter positive numbers!");
				System.out.print("Enter product number (1-5) and quantity: ");

			}

			// checking if productNumber input is within range 1-5
			if (productNumber <= 0 || productNumber > 5) {
				productNumber = 0; // assigning to 0 because (0 * quantity) is 0 (no interference)
				System.out.println("Enter product number that is within the range 1-5!");
				System.out.print("Enter product number (1-5) and quantity: ");
			}

			// determining input to each case and calculating total (no default needed
			// because input is being checked above)
			switch (productNumber) {

			case 1:
				total += (2.98 * quantity);
				break;
			case 2:

				total += (4.50 * quantity);
				break;
			case 3:

				total += (9.98 * quantity);
				break;
			case 4:

				total += (4.49 * quantity);
				break;
			case 5:
				total += (6.87 * quantity);
				break;
			}

		}
	}

	// prints total retail value when called
	public void displayTotalRetailValue() {
		System.out.printf("\nTotal Retail Value: $%.2f", total);
	}
	
}