/** 
 * Homework 2; Problem #3.16 in Deitel
 * @author erictikhonov
 */
import java.time.*;
import java.util.*;
public class HeartRates {

	String firstName;
	String lastName;
	String dateOfBirth;
	
	public HeartRates(String fName, String lName,String DOB) {
		firstName = fName;
		lastName = lName;
		dateOfBirth = DOB; 
	}
	
	//a method to display all information
	public void details() {
		System.out.println("First name: " + getfirstName() );
	    System.out.println("Last name: " + getlastName() );
		System.out.println("Date of Birth: " + getDateOfBirth() );
		System.out.println("Age: " + age() + " years old");
		System.out.println("Maximum Heart Rate: " + maximumHeartRate() + " beats per minute");
		System.out.println("Target Heart Rate: Between "+ (maximumHeartRate()*.5) + " and " + (maximumHeartRate()*.85) + " beats per minute");
	}
	
	//setting date of birth
	public void setDateOfBirth(String DOB) {
		//splitting the "/" and converting into integers
		String[] parts = DOB.split("/");
		 int birthMonth = Integer.parseInt(parts[0]);
	     int birthDay = Integer.parseInt(parts[1]);
	     int birthYear = Integer.parseInt(parts[2]);
		
		dateOfBirth = birthMonth + "/" + birthDay + "/" + birthYear;
	}
	
	//returns the date of birth
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	//gets age in years
	public int age() {
		String[] parts = dateOfBirth.split("/");
		int birthMonth = Integer.parseInt(parts[0]);
	    int birthDay = Integer.parseInt(parts[1]);
	     int birthYear = Integer.parseInt(parts[2]);
	     Calendar now = Calendar.getInstance();
	     int localYear = now.get(Calendar.YEAR);
	    int localMonth = now.get(Calendar.MONTH);
	    int localDay = now.get(Calendar.DAY_OF_MONTH);
		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
		
		return Period.between(birthDate, LocalDate.of(localYear, localMonth, localDay)).getYears();
	}
	
	//calculates max heart rate
	public int maximumHeartRate() {
		int maxHR = 220 - age();
		return maxHR;
	}
	
	//setting the first name
	public void setfirstName(String fName) {
		firstName = fName;
	}
	
	//returns the first name
	public String getfirstName() {
		return firstName;
	}
	
	//setting the last name
	public void setlastName(String lName) {
		lastName = lName;
	}
	
	//returns the last name
	public String getlastName() {
		return lastName;
	}
}
