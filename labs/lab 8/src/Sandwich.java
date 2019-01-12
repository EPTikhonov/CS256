/** 
 * Lab 8
 * @author erictikhonov
 */
import java.util.*;
public class Sandwich {

	public static void main(String[] args) {
		
		//Print the Hamburger Palace sign.
		System.out.println("******************************");
		int line = 0;
		while(line < 5) {
			System.out.println("*                            *");
			line = line + 1;
		}
		System.out.println("* Hamburger Palace           *");
		
		int line2 = 0;
		while(line2 < 5) {
			System.out.println("*                            *");
			line2 = line2 + 1;
		}
		System.out.println("******************************\n");
		
		//Create a Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		//Ask how much of lettuce the user wants (reject negative numbers)
		int lettuce;
		do {
			System.out.println("How many layers of lettuce do you want?");
			lettuce = input.nextInt();
		} while(lettuce < 0);
		
		//Ask how much of tomatoes the user wants (reject negative numbers)
		int tomatoes;
		do {
			System.out.println("How many layers of tomatoes do you want?");
			tomatoes = input.nextInt();
		} while(tomatoes < 0);
		
		//closing scanner input
		input.close();
		
		//top bun
		System.out.println("Here's your sandwich:\n");
		System.out.println("(_________)");
		
		//printing lettuce
		for (int i = 1; i <= lettuce; i++) {
			System.out.println(" ~~~~~~~~~");
		}
		
		//printing tomatoes
		for (int i = 1; i <= tomatoes; i++) {
			System.out.println(" [  ] [  ]");
		}
		
		//bottom bun
		System.out.println(" *********");
		System.out.println("(_________)");
	}

}
