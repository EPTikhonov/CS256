/** 
 * Homework 2; Problem #3.16 in Deitel
 * @author erictikhonov
 */
import javax.swing.JOptionPane;
public class HeartRatesTest {

	public static void main(String[] args) {
		
		String fName = JOptionPane.showInputDialog("Enter your First Name");
		String lName = JOptionPane.showInputDialog("Enter your Last Name");
		String dateOfBirth = JOptionPane.showInputDialog("Enter your Date of Birth (mm/dd/yyyy)");
		
		HeartRates person = new HeartRates(fName,lName,dateOfBirth); 
	    
		person.details();
	}
}