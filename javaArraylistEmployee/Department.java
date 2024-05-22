import java.util.ArrayList;

public class Department {
  private ArrayList<Employee> employees;

  public Department() {
    this.employees = new ArrayList<Employee>();
  }

  public void addEmployee(Employee employee) {
    if (employee != null) {
      this.employees.add(employee);
    } else {
      System.out.println("Invalid");
    }
  }

  public String toString() {
    String employeeInfo = "";

    for (Employee currentEmployee : this.employees) {
      employeeInfo = employeeInfo + currentEmployee.toString() + "\n";
    }

    return employeeInfo;
  }

  public double getHighestPay() {
    Employee highestSoFar = this.employees.get(0);

    for (Employee currentEmployee : this.employees) {
      if(currentEmployee.getPayRate() > highestSoFar.getPayRate()) {
        highestSoFar = currentEmployee;
      }
    }

    return highestSoFar.getPayRate();
  }

  public double getLowestPay() {
    Employee lowestSoFar = this.employees.get(0);

    for (Employee currentEmployee : this.employees) {
      if(currentEmployee.getPayRate() < lowestSoFar.getPayRate()) {
        lowestSoFar = currentEmployee;
      }
    }
    return lowestSoFar.getPayRate();
  }

  public double getAveragePayRate() {
    double total = 0;
    int count = 0;
    for (Employee currentEmployee : this.employees) {
      total = total + currentEmployee.getPayRate();
      count++;
    }
    return total / count;
  }




  
}
