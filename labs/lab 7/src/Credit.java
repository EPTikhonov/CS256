/** 
 * Lab 7
 * @author erictikhonov
 */
import java.util.Scanner;
public class Credit {

	Scanner input = new Scanner(System.in);
	int account; //account number
	int oldBalance; //starting balance
	int charges; //total charges
	int credits; //total credits
	int creditLimit; //allowed credit limit
	int newBalance; //new balance
	
	public Credit () {
		
	}
	
	public void calculateBalance() {
		System.out.print("Enter account number (or -1 to quit): ");
		account = input.nextInt();
		
		while (account != -1) {
			
			System.out.print("Enter Balance: ");
	          oldBalance = input.nextInt();
	          
	        System.out.print("Enter Charges: ");
	          charges = input.nextInt();
	          
	        System.out.print("Enter Credits: ");
	          credits = input.nextInt();
	         
	        System.out.print("Enter Credit Limit: ");
	          creditLimit = input.nextInt();
	          
			//calculating new balance using given equation
	        newBalance = oldBalance + (charges - credits);
	        System.out.println("New Balance is: "+ newBalance);
	        
	        //making sure that credit limit is not exceeded
			if (newBalance > creditLimit) {
				System.out.println("Credit limit was exceeded.");
			} 
	        
			//asking for account number again
			System.out.print("Enter account number (or -1 to quit): ");
			account = input.nextInt();
			
		}
	}
}
