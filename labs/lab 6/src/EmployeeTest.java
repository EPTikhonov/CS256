/** 
 * Lab 6
 * @author erictikhonov
 */
import javax.swing.JOptionPane;
public class EmployeeTest {

	public static void main(String[] args) {
		
		String fName = JOptionPane.showInputDialog("Enter your First Name");
		String lName = JOptionPane.showInputDialog("Enter your Last Name");
		double monthlySalary = Double.parseDouble(JOptionPane.showInputDialog("Enter Monthly Salary"));
		
		
		Employee Employee1 = new Employee(fName, lName, monthlySalary);
		
		//display raises
		System.out.print("Employee 1: " + fName + " " + lName + "; ");
		Employee1.displaySalary();
		
		System.out.println("\nIncreasing " +fName + " " + lName + "'s salary by 10%");
		
		//give raises
		Employee1.giveRaise();
		
		//display raises
		System.out.print("Employee 1: "+ fName + " " + lName + "; ");
		Employee1.displaySalary();
		
	}
}
