/** 
 * Lab 5
 * @author erictikhonov
 */
public class Employee {
	
	String firstName;
	String lastName;
	double salary;

	//class constructors
	public Employee(String fName, String lName, double monthlySalary) {
			firstName = fName;
			lastName = lName;
			salary = monthlySalary;
			
			//validating the salary to ensure that it is not negative
			if (salary < 0) {
				salary = 0;
			}
	}
	
	//setting first name
	public void setFirstName(String fName) {
			firstName = fName;
	}
	
	//getting first name
	public String getFirstName() {
		return firstName;
	}
	
	//setting last name
	public void setLastName(String lName) {
			lastName = lName;
		}
		
	//getting last name
	public String getLastName() {
		return lastName;
		
	}
	
	//setting monthly salary method
	public void setMonthlySalary(double monthlySalary) {
		salary = monthlySalary;
	}
	
	//getting monthly salary method
	public double getMonthlySalary() {
		return salary;
	}
	
	public void displaySalary() {
		System.out.printf("Yearly Salary: %.2f\n", (getMonthlySalary()*12));
	}
	
	//giving 10% raise to employees
	public double giveRaise() {
		salary = salary + (salary * .10);
		return salary;
	}
	public void display() {
	System.out.println("Employee 1: ");
	}
	
}
