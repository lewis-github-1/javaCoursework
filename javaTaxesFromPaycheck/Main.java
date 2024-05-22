import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Variables
    String name;
    double hours, rate, gross, fedAmount, stateAmount, ficaAmount, net;
    
    // Constants
    final double FED_RATE = .15;
    final double STATE_RATE = .0495;
    final double FICA_RATE = .0725;
    
    // Scanner for input
    Scanner keyboard = new Scanner(System.in);

    // Get inputs
    System.out.print("Enter your name: ");
    name = keyboard.nextLine();

    System.out.print("Enter your hours: ");
    hours = Double.parseDouble(keyboard.nextLine());

    System.out.print("Enter your rate: ");
    rate = Double.parseDouble(keyboard.nextLine());

    // Calculations
    gross = hours * rate;
    fedAmount = gross * FED_RATE;
    stateAmount = gross * STATE_RATE;
    ficaAmount = gross * FICA_RATE;
    net = gross - fedAmount - stateAmount - ficaAmount;

    // Display the values with formatting
    System.out.println();
    System.out.println(name + " Paycheck:");
    System.out.println("=====================");
    System.out.printf("%-11s%8.2f\n", "Hours", hours);
    System.out.printf("%-10s$%8.2f\n", "Rate", rate);
    System.out.println("---------------------");
    System.out.printf("%-10s$%8.2f\n", "Gross", gross);
    System.out.println("---------------------");
    System.out.printf("%-10s$%8.2f\n", "Federal", fedAmount);
    System.out.printf("%-10s$%8.2f\n", "State", stateAmount);
    System.out.printf("%-10s$%8.2f\n", "FICA", ficaAmount);
    System.out.printf("%-10s$%8.2f\n", "Net", net);
    System.out.println("=====================");   

    // Close the scanner object
    keyboard.close();

  }
}