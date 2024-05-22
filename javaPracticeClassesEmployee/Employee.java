public class Employee {
  private String fname;
  private String lname;
  private double payRate;
  private double hours;

  public Employee() {    
    this("None", "None", 0, 0);
  }
  
  // Constructor with arguments
  public Employee(String fn, String ln, double rate, double hrs) {
    this.fname = fn;
    this.lname = ln;
    this.payRate = rate;
    this.hours = hrs;    
  }
      
  // Getters / accessors for attributes/fields:
  public double getPayRate() {return this.payRate;}
  public double getHours() {return this.hours;}
  public String getFirstName() {return this.fname;}
  public String getLastName() {return this.lname;}

  // Methods that return calculated values
  public String getFullName() {return this.fname + ' ' + this.lname;}
  public double getGrossPay() {return this.hours * this.payRate;}
  public String toString() {return this.getFullName() + " made $" + this.getGrossPay();}
  
}


