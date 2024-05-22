class Main {
  public static void main(String[] args) {
    Employee employee1 = new Employee("Darth", "Vader", 10.75);
    Employee employee2 = new Employee("Luke", "Skywalker", 15.25);
    Employee employee3 = new Employee("Han", "Solo", 18.50);
    
    Department dept1 = new Department();

    dept1.addEmployee(employee1);
    dept1.addEmployee(employee2);
    dept1.addEmployee(employee3);

    System.out.println("\n");

    System.out.println("The expected highest pay rate should be 18.50");
    System.out.printf("The actual highest pay rate is %.2f", dept1.getHighestPay());
    System.out.println("\n");

    System.out.println("The expected lowest pay rate should be 10.75");
    System.out.printf("The actual lowest pay rate is: %.2f", dept1.getLowestPay());
    System.out.println("\n");

    System.out.println("The expected average pay rate should be 14.83");
    System.out.printf("The actual average pay rate is: %.2f", dept1.getAveragePayRate());
    System.out.println("\n");
    
    
    System.out.println(dept1.toString());

  }
}