/** 
 * Lab 16
 * @author erictikhonov
 */
import java.util.Scanner;

public class Time2Test
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner( System.in );

		Time2 time = new Time2();
		int choice = getMenuChoice();

		while ( choice != 5 )
		{
			switch ( choice )
			{
			case 1: // set hour
				System.out.print("Enter Hours: ");
				int hours = input.nextInt();

				try {
					time.setHour(hours);
				}
				catch (IllegalArgumentException e) {
					System.out.println("\nException: hour was out of range\n");
				}
				break;
			case 2: // set minute
				System.out.print("Enter Minutes: ");
				int minutes = input.nextInt();
				try {
					time.setMinute(minutes);
				}
				catch (IllegalArgumentException e) {
					System.out.println("\nException: minute was out of range\n");
				}
				break;
			case 3: // set seconds
				System.out.print("Enter Seconds: ");
				int seconds = input.nextInt();
				try {
					time.setSecond(seconds);
				}
				catch (IllegalArgumentException e) {
					System.out.println("\nException: second was out of range\n");
				}
				break;
			case 4: // add 1 second
				time.tick();
				break;
			}

			System.out.printf( "Hour: %d  Minute: %d  Second: %d\n",
					time.getHour(), time.getMinute(), time.getSecond() );
			System.out.printf( "Universal time: %s   Standard time: %s\n",
					time.toUniversalString(), time.toString() );

			choice = getMenuChoice();
		}     

		input.close();
	}

	// prints a menu and returns a value corresponding to the menu choice
	private static int getMenuChoice()
	{
		Scanner input = new Scanner( System.in );

		System.out.println( "1. Set Hour" );
		System.out.println( "2. Set Minute" );
		System.out.println( "3. Set Second" );
		System.out.println( "4. Add 1 second" );
		System.out.println( "5. Exit" );
		System.out.print( "Choice: " );

		return input.nextInt();
	}
}