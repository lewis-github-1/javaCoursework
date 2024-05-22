public class Employee {
  // Paste your Employee.java code from Ch 9 here
  private String name;
  private int employeeNumber;
  private String hireDate;

  public Employee(String n, int num, String date) throws InvalidEmployeeNumber {
    name = n;
    setEmployeeNumber(num);
    hireDate = date;
  }

  public Employee() {
    name = "";
    employeeNumber = 0;
    hireDate = "";
  }

  public void setName(String n) {
    name = n;
  }

  public void setEmployeeNumber(int e) throws InvalidEmployeeNumber {
    if (isValidEmpNum(e))
      employeeNumber = e;
    else
      throw new InvalidEmployeeNumber();
  }

  public void setHireDate(String h) {
    hireDate = h;
  }

  public String getName() {
    return name;
  }

  public int getEmployeeNumber() {
    return employeeNumber;
  }

  public String getHireDate() {
    return hireDate;
  }

  private boolean isValidEmpNum(int e) {
    boolean status;

    if (e >= 0 && e <= 9999)
      status = true;
    else
      status = false;

    return status;
  }


  public String toString() {
    return "Name: " + name + "\n" + "Employee Number: " + 
      getEmployeeNumber() + "\n" + "Hire Date: " + getHireDate() + "\n";
}



}
