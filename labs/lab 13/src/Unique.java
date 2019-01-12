
/** 
 * Lab 13
 * @author erictikhonov
 */
import java.util.Scanner;

public class Unique {

	// gets 5 unique numbers from the user
	public void getNumbers() {

		Scanner input = new Scanner(System.in);

		int[] numbers = new int[5]; // the maximum of numbers the program can store
		int count = 0; // number of uniques read
		int entered = 0; // number of entered numbers
		int number = 0;

		while (entered < numbers.length) {
			System.out.print("Enter number: ");

			number = input.nextInt();

			// if number input is between 10 & 100 continue
			if ((number >= 10) && (number <= 100)) {

				// flags whether this number already exists
				boolean containsNumber = false;

				// increment number of entered numbers
				entered++;

				// check for duplicates in array
				for (int i : numbers) {
					if (number == i) {
						containsNumber = true;
					}
				}

				// if no duplicates then add number to array
				if (!containsNumber) {
					numbers[count] = number;
					count++;

				} else {
					System.out.printf("%d has already been entered\n", number);
				}

			} else
				System.out.println("number must be between 10 and 100");

			// printing unique elements in array
			for (int i = 0; i < count; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}
		input.close();
	}

}