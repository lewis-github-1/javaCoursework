public class Student {
	private String firstName;
	private String lastName;
	private int grade;
	
	public Student(String firstName, String lastName, int grade ) {
		if (grade < 0) {	
			grade = 0;
		} else if (grade > 100) {
			grade = 100;
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

	public int getGrade() {
		return this.grade;
	}
	
	public String toString() {
		return this.getFullName() + " with grade: " + this.grade;
	}
}