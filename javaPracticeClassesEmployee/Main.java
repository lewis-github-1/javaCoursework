
class Main {
  public static void main(String[] args) {
		// This will be the driver file

    // Creates first instance of Employee class
    Employee emp1 = new Employee();
    System.out.println(emp1);
    System.out.println(emp1.toString());

    
    // Creates second instance of Employee class
    Employee emp2 = new Employee("John", "Doe", 10.25, 20);
    System.out.println(emp2);
    System.out.println(emp2.toString());


  }
}