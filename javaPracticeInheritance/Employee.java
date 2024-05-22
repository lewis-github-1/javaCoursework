public class Employee {
    private String name;                // employee name
    private String employeeNumber;      // employee number
    private String hireDate;            // employee hire date

    // This constructor initializes an object with a name, 
    //      employee number, and hire date.
    public Employee(String n, String num, String date) {
        name = n;
        setEmployeeNumber(num);
        hireDate = date;
    }

    // The no-arg constructor initializes an object with null
    //      string for name, employee number, and hire date.
    public Employee() {
        name = "";
        employeeNumber = "";
        hireDate = "";
    }

    // The setName method sets the employee's name.
    public void setName(String n) {
        name = n;
    }

    // The setEmployeeNumber method sets the employee's number
    // Why is it written like this?    
    public void setEmployeeNumber(String e) {
        if (isValidEmpNum(e))               
            employeeNumber = e;
        else
            employeeNumber = "";
    }

    // The setHireDate method sets the employee's hire date
    public void setHireDate(String h) {
        hireDate = h;
    }

    // The getName method returns the employee's name
    public String getName() {
        return name;
    }

    // The getEmployeeNumber method returns the
    //      employee's number
    public String getEmployeNumber() {
        return employeeNumber;
    }

    // The isValidEmpNum method returns true if the argument
    //      is a valid employee number, or false otherwise.
    private boolean isValidEmpNum(String e) {
        boolean status = true;
        if (e.length() != 5)
            status = false;
        else {
            if ((!Character.isDigit(e.charAt(0)))          ||
                (!Character.isDigit(e.charAt(1)))           ||
                (!Character.isDigit(e.charAt(2)))           ||
                (e.charAt(3) != '-')                        ||
                (Character.toUpperCase(e.charAt(4)) < 'A')  ||
                (Character.toUpperCase(e.charAt(4)) > 'M'))
                    status = false;
        }
        return status;
    }

    // toString method
    public String toString() {
        String str = "Name: " + name + "\nEmployee Number: ";

        if (employeeNumber == "")
            str += "INVALID EMPLOYEE NUMBER";
        else
            str += employeeNumber;
        
        str += ("\nHire Date: " + hireDate);
        return str;
    }


}
