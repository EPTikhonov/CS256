/** 
 * Lab 5
 * @author erictikhonov
 */
public class EmployeeTest {

	public static void main(String[] args) {
		Employee Employee1 = new Employee("Bob","Jones", 2875.00);
		Employee Employee2 = new Employee("Susan","Baker", 3150.75);
		
		//display raises
		System.out.print("Employee 1: Bob Jones; ");
		Employee1.displaySalary();
		System.out.print("Employee 2: Susan Baker; ");
		Employee2.displaySalary();
		
		System.out.println("\nIncreasing Employee salaries by 10%");
		
		//give raises
		Employee1.giveRaise();
		Employee2.giveRaise();
		
		//display raises
		System.out.print("Employee 1: Bob Jones; ");
		Employee1.displaySalary();
		System.out.print("Employee 2: Susan Baker; ");
		Employee2.displaySalary();
		
	}
}
