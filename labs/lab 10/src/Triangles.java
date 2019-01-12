/** 
 * Lab 10
 * @author erictikhonov
 */
import java.util.*;
public class Triangles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int rows; // the rows position
		
		// do-while loop to make sure input is positive
		do {
			System.out.print("Enter # of rows: ");
			rows = input.nextInt();
		} while (rows < 0);
		
		input.close();
		System.out.println();
		
		/* first triangle */
		 
		// printing number of rows
		for (int i = 0; i < rows; i++) {
			System.out.print("*");
			
			// printing number of columns
			for (int x = 0; x < i; x++) {
				System.out.print("*");
				
			} 
			// new line after each rows
			System.out.println();
		}
		
		System.out.println();
		
		/* second triangle */
		
		// printing number of rows
		for (int i = 0; i < rows; i++) {
			System.out.print("*");
			
			// printing number of columns
			for (int x = rows - 1; x > i; x--) {
				System.out.print("*");
			} 
			// new line after each rows
			System.out.println();
		}
		
		System.out.println();
		
		/* third triangle */
		
		// printing number of rows
		for (int i = 0; i < rows; i++) {
			
			// printing space
			for (int x = 0; x < i; x++) {
				System.out.print(" ");
			}
			
			
			// printing number of columns
			for (int y = rows; y > i; y--) {
					System.out.print("*");
			} 
			// new line after each rows
			System.out.println();
		}
		
		/* fourth triangle */
			
		// printing number of rows
		for (int i = 0; i <= rows; i++) {
			
			// printing space
			for (int x = rows; x > i; x--) {
				System.out.print(" ");
			}
				
			// printing number of columns
			for (int y = 0; y < i; y++) {
				System.out.print("*");
			}
			// new line after each rows
			System.out.println();
		}

	}	 
}