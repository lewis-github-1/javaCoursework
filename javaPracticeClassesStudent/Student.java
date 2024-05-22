public class Student {
	// Create Student attributes (there should be 4)
  private String fname;
  private String lname;
  private double gpa;
  private String major;

	// Constructor with no parameters
  public Student() {
    this("None", "None", 0, "None");
  }

	// Constructor with just first and last name parameter
  public Student(String fn, String ln) {
    this.fname = fn;
    this.lname = ln;
    this.gpa = 0;
    this.major = "None";
  }

	// Constructor with all parameters except GPA
  public Student(String fn, String ln, String maj) {
      this.fname = fn;
      this.lname = ln;
      this.gpa = 0;
      this.major = maj;
    }

	// Constructor with all 4 parameters
  public Student(String fn, String ln, double gpa, String maj) {
        this.fname = fn;
        this.lname = ln;
        this.gpa = gpa;
        this.major = maj;
      }

	// Getters/accessors for attributes/fields
  public String getFirstName() {return this.fname;}
  public String getLastName() {return this.lname;}
  public double getGPA() {return this.gpa;}
  public String getMajor() {return this.major;}

	// Methods that return calculated values or expressions
  public String getFullName() {return this.lname + ", " + this.fname;}
  public String toString() {
    return String.format("%-15s %10.2f %-20s", this.getFullName(), this.getGPA(), this.getMajor());
    
  }
	
}