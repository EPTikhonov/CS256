/** 
 * Homework 1; Problem #2.15 in Deitel
 * @author erictikhonov
 */
import java.util.Scanner;

public class problem_2_15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int a = input.nextInt(); //getting first integer input
		
		System.out.print("Enter an integer: ");
		int b = input.nextInt(); //getting second integer input
		
		
		int c = a + b; //Sum
		System.out.println("Sum: " + c);
		
		int d = a * b; //Product
		System.out.println("Product: " + d);
		
		int e = a - b; //Difference
		System.out.println("Difference: " + e);
		
		int f = a / b; //Quotient (division)
		System.out.println("Quotient: " + f);

		input.close(); //close scanner input
	}

}
