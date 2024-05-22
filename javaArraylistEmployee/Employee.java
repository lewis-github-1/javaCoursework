
public class Employee {
	private String firstName;
	private String lastName;
	private double payRate;
	
	public Employee(String first, String last, double rate) {
		this.firstName = first;
		this.lastName = last;
		this.payRate = rate;
	}
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
	public double getPayRate() {
		return this.payRate;
	}
	
	public String toString() {
		return String.format(this.firstName + " " + this.lastName + " has a pay rate of $%.2f", this.payRate);
	}
}