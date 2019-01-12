/** 
 * Lab 9
 * @author erictikhonov
 */
public class Square {
	
	private double side1;
	private double side2;
	private double area;
	private double perimeter;
	private double diagonalLength;
	
	public Square(double x, double y) {
		side1 = x;
		side2 = y;
	}
	
	//calculating area
	public void area() {
		area = side1 * side2;
		System.out.printf("Area: %.2f\n", area);
	} 
	
	//calculating perimeter
	public void perimeter() {
		perimeter = (side1 + side2) * 2;
		System.out.printf("Perimeter: %.2f\n", perimeter);
	} 
	
	//calculating diagonalLength
	public void diagonalLength() {
		diagonalLength = Math.sqrt((side1*side1)+(side2*side2));
		System.out.printf("Diagonal Length: %.2f", diagonalLength);
	}
}
