
public class Student {
	private String name;
	private int idNumber;
	private double gpa;
	private int creditHours;
	
	public Student(String nm, int id, double gr, int hrs) throws 
		InvalidCreditHoursException, InvalidGPAException, InvalidIDException,
		InvalidNameException {
		this.setName(nm);
		this.setId(id);
		this.setGPA(gr);
		this.setCreditHours(hrs);
	}
	
	public void setName(String name) throws InvalidNameException {
		if (name == "" || name == null){
			throw new InvalidNameException();
		}
		else {
			this.name = name;
		}
	}
	
	public void setId(int id) throws InvalidIDException {
		if (id < 1) {
			throw new InvalidIDException(id);
		}
		else {
			this.idNumber = id;
		}		
	}
	
	public void setGPA(double g) throws InvalidGPAException {
		if (g < 0 || g > 4.0) {
			throw new InvalidGPAException(g);
		}
		else {
			this.gpa = g;
		}			
	}
	
	public void setCreditHours(int hrs) throws InvalidCreditHoursException {
		if (hrs < 0 || hrs > 60) {
			throw new InvalidCreditHoursException(hrs);
		}
		else {
			this.creditHours = hrs; 
		}
	}

	public String getName() { return this.name; }
	public int getIdNumber() { return this.idNumber; }
	public double getGpa() { return this.gpa; }
	public int getCredits() { return this.creditHours; }
	
	public String toString() {
		String str = this.getName();
		str += "'s ID is " + this.getIdNumber();
		str += " and has a GPA of " + this.getGpa();
		str += " and has earned " + this.getCredits() + " credits";
		return str;
	}
}


