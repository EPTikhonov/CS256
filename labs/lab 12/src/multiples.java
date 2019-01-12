/** 
 * Lab 12; Problem #6.16 in Deitel
 * @author erictikhonov
 */
import java.util.Scanner;

public class multiples {

	Scanner input = new Scanner(System.in);
	private static int first;
	private static int second;
	
	// getting input(s) from user and printing results
	public void askInputAndPrint() {
		while (true) {
			System.out.print("Enter first integer: ");
			first = input.nextInt();
			System.out.print("Enter second integer: ");
			second = input.nextInt();

			System.out.println( isMultiple(first, second) );
			
		}
	}
	
	// determines whether the second value in each pair is a multiple of the first
	public boolean isMultiple(int first, int second) {
		if (second%first == 0) {
			return true;
		} else {
			return false;
		}
	}
	 
}
