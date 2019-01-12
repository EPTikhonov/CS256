/** 
 * Homework 4; Problem #8.11 in Deitel
 * @author erictikhonov
 */
public class ComplexTest {

	public static void main(String[] args) {

		Complex number1 = new Complex(2.3, 4.5);
		Complex number2 = new Complex(3.4, 5.0);
		Complex number3 = new Complex();

		/* using add method */
		System.out.println("Adding number1 and number2:");
		Complex.add(number1, number2);
		
		// adding number3 (an empty constructor)
		System.out.println("Adding number1 and number3:");
		Complex.add(number1, number3);
		
		System.out.println();
		
		/* using subtract method */
		System.out.println("Subtracting number2 and number1:");
		Complex.subtract(number2, number1);
		
		// subtracting number3 (an empty constructor)
		System.out.println("Subtracting number1 and number3:");
		Complex.subtract(number1, number3);
	}

}
