import java.util.Scanner;

public class allInOne {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		while (true) {
			System.out.print("Enter the First Integer: ");
			int firstNumber = input.nextInt();
			
			System.out.print("Enter the Second Integer: ");
			int secondNumber = input.nextInt();
			
			System.out.println(isMultiple(firstNumber, secondNumber));
		}
	} 
	
	public static boolean isMultiple (int firstNumber, int secondNumber)
	{
		if (secondNumber % firstNumber == 0)
		
			return true;
		else {
			return false;
		}
		
	}
}