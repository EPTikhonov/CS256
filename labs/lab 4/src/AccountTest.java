/** 
 * Lab 4
 * @author erictikhonov
 */

import java.util.Scanner;
public class AccountTest
{
   // main method begins execution
   public static void main( String args[] ) 
   {
      Account account1 = new Account( 50.00 ); // create Account object
      Account account2 = new Account(-7.53); // create Account object
      
      // display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
    	         account2.getBalance() );
      
      //create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);
      
      double withdrawalAmount; 
      
      System.out.print("Enter withdrawal amount for account1: ");
      withdrawalAmount = input.nextDouble(); //obtain user input
      System.out.printf("\nsubtracting %.2f from account1 balance\n", 
    	         withdrawalAmount );
      
      //withdraw from account1
      account1.debit( withdrawalAmount );
      
      //display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
    	         account2.getBalance() );
      
      System.out.print("Enter withdrawal amount for account2: ");
      withdrawalAmount = input.nextDouble(); //obtain user input
      System.out.printf("\nsubtracting %.2f from account2 balance\n", 
    	         withdrawalAmount );
      
      //closing scanner input
      input.close();
      
      //withdraw from account2
      account2.debit( withdrawalAmount );
      
      // display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n", 
    	         account2.getBalance() );
      
   } // end main

} // end class AccountTest

/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/