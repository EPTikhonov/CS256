/** 
 * Lab 16
 * @author erictikhonov
 */
public class Time2
{
	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59

	// Time2 no-argument constructor: initializes each instance variable 
	// to zero; ensures that Time2 objects start in a consistent state
	public Time2()
	{
		this( 0, 0, 0 ); // invoke Time2 constructor with three arguments
	}

	// Time2 constructor: hour supplied, minute and second defaulted to 0
	public Time2( int h ) 
	{ 
		this( h, 0, 0 ); // invoke Time2 constructor with three arguments
	}

	// Time2 constructor: hour and minute supplied, second defaulted to 0
	public Time2( int h, int m ) 
	{ 
		this( h, m, 0 ); // invoke Time2 constructor with three arguments
	}

	// Time2 constructor: hour, minute and second supplied
	public Time2( int h, int m, int s ) 
	{ 
		setTime( h, m, s ); // invoke setTime to validate time
	} 

	// Time2 constructor: another Time2 object supplied
	public Time2( Time2 time )
	{
		// invoke Time2 constructor with three arguments
		this( time.getHour(), time.getMinute(), time.getSecond() );
	}

	/* Set Methods */

	// set a new time value using universal time; perform 
	// validity checks on data; set invalid values to zero
	public void setTime( int h, int m, int s )
	{
		setHour( h ); // set the hour
		setMinute( m ); // set the minute
		setSecond( s ); // set the second

	}

	// validate and set hour 
	public void setHour( int h ) 
	{ 
		if ( h >= 0 && h < 24 ) {
			hour = h;
		} else {
			hour = 0;
			throw new IllegalArgumentException();
		}
	}

	// validate and set minute 
	public void setMinute( int m ) 
	{ 
		if ( m >= 0 && m < 60 ) {
			minute = m;
		} else {
			minute = 0;
			throw new IllegalArgumentException();
		}
	}

	// validate and set second 
	public void setSecond( int s ) 
	{ /*
		if ( s >= 0 && s < 60 ) {
			second = s;
		} else {
			second = 0;
			throw new IllegalArgumentException();
		} */
		second = ((s >= 0 && s <= 60) ? s : 0);
		if ( (s < 0) && (s > 60) ) throw new IllegalArgumentException();
	}

	/* Get Methods */

	// get hour value
	public int getHour() 
	{ 
		return hour; 
	} // end method getHour

	// get minute value
	public int getMinute() 
	{ 
		return minute; 
	}

	// get second value
	public int getSecond() 
	{ 
		return second; 
	}

	// Tick the time by one second
	public void tick()
	{
		setSecond(second + 1);
	}

	// Increment the minute
	public void incrementMinute()
	{
		setMinute(minute + 1);
		if (minute == 0) {
			incrementHour();
		}
	}

	// Increment the hour
	public void incrementHour()
	{
		setHour(hour + 1);
	}

	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString()
	{
		return String.format( 
				"%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
	}

	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString()
	{
		return String.format( "%d:%02d:%02d %s", 
				( ( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 ),
				getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
	}

}