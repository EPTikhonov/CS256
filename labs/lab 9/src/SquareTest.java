/** 
 * Lab 9
 * @author erictikhonov
 */
import java.util.Scanner;
public class SquareTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Area, Perimeter, and Diagonal Length Calculator!");
		System.out.print("Enter first side: ");
		double x = input.nextDouble();
		
		System.out.print("Enter second side: ");
		double y = input.nextDouble();
		
		Square application = new Square(x, y);
		
		input.close();
		application.area();
		application.perimeter();
		application.diagonalLength();
	}

}
