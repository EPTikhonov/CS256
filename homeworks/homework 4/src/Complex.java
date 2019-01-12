/**
 * Homework 4; Problem #8.11 in Deitel
 * 
 * @author erictikhonov
 * 
 * Using add, subtract, and print methods for complex numbers
 */
public class Complex {

	private double realPart;
	private double imaginaryPart;

	// constructor
	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	// constructor for default values
	public Complex() {

		realPart = 1.5; // default value
		imaginaryPart = 3.1; // default value
	}

	// add both real parts & imaginary parts
	public static void add(Complex number1, Complex number2) {
		Complex temp = new Complex(0.0, 0.0);

		temp.realPart = number1.realPart + number2.realPart;
		temp.imaginaryPart = number1.imaginaryPart + number2.imaginaryPart;
		
		print(temp); // printing result of add method
	}

	// subtract both real parts & imaginary parts
	public static void subtract(Complex number1, Complex number2) {
		Complex temp = new Complex(0.0, 0.0);

		temp.realPart = number1.realPart - number2.realPart;
		temp.imaginaryPart = number1.imaginaryPart - number2.imaginaryPart;
		
		print(temp); // printing result of subtract method
	}

	// printing results
	public static void print(Complex number) {
		Complex temp = new Complex(0.0, 0.0);

		temp.realPart = number.realPart;
		temp.imaginaryPart = number.imaginaryPart;
		
		System.out.printf("(%.1f, %.1fi)\n", number.realPart, number.imaginaryPart);
	}

}
