/** 
 * Homework 3; Problem #5.21 in Deitel
 * @author erictikhonov
 */
public class pythagoreanTriple {
	
	private int max; // maximum number to check triples up to
	
	// constructor that takes in the max (500)
	public pythagoreanTriple(int maxLimit) {
		this.max = maxLimit;
	}
	
	public void displayTable() {
		
		// printing table header
		System.out.println("side1\tside2\thypotenuse");
		
		// looping each side up to max
		for(int a = 1; a <= max; a++) {
			for (int b = a; b <= max; b++) {
				for (int c = 1; c <= max; c++) {
					// printing all pythagorean triplets
					if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
						System.out.println(a+"\t"+b+"\t"+c);
					}
				}
			}
		}
	}
}
