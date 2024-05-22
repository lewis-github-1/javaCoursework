import java.util.Scanner;

public class Menu {
  private Scanner keyboard = new Scanner(System.in);

  public void run(){
    displayMenu();    // Displays menu
    valueConvert();  
    
  }

  private void displayMenu(){
    System.out.println("1.  Inches to Centimeters");
    System.out.println("2.  Centimeters to Inches");
    System.out.println("3.  Miles to Kilometers");
    System.out.println("4.  Kilometers to Miles");
    System.out.println("5.  Quit");
    System.out.println();
  }

  private void valueConvert(){
    System.out.print("Enter the menu choice: ");
    int choice = Integer.parseInt(keyboard.nextLine());
    valueDisplay(choice);
  }

  private void valueDisplay(int ch){
    switch(ch) {
      case 1:
        System.out.print("Enter the inches to be converted: ");
        double inches = Double.parseDouble(keyboard.nextLine());
        System.out.printf("\n%.2f inches is equal to %.2f centimeters", inches, Metric.inchToCm(inches));
        break;
      case 2:
        System.out.print("Enter the centimeters to be converted: ");
        double centimeters = Double.parseDouble(keyboard.nextLine());        
        System.out.printf("\n%.2f centimeters is equal to %.2f inches", centimeters, Metric.cmToInch(centimeters));
        break;	
      case 3:
        System.out.print("Enter the miles to be converted: ");
        double miles = Double.parseDouble(keyboard.nextLine());
        System.out.printf("\n%.2f miles is equal to %.2f kilometers", miles, Metric.milesToKm(miles));
        break;	
      case 4:
        System.out.print("Enter the kilometers to be converted: ");
        double kilometers = Double.parseDouble(keyboard.nextLine());
        System.out.printf("\n%.2f kilometers is equal to %.2f miles", kilometers, Metric.kmToMiles(kilometers));
        break;
      case 5:
        System.out.println("Thank you for using the app!\n");
      default:
        System.out.print("Invalid choice");
        break;
    }
  }

}