import java.util.Scanner;

public class Menu {
	private Scanner keyboard = new Scanner(System.in);
	
	public void run() {
		// call method to display the menu
		displayMenu();
		
		// call method to get the Menu Choice
		getMenuChoice();
		keyboard.close();
	}
	
	private void displayMenu() {
		System.out.println("\n\nWelcome to the Geometry app\n==========================");
		System.out.println("1.  Circle");
		System.out.println("2.  Rectangle");
		System.out.println("3.  Triangle");
		System.out.println("4.  Quit");
		System.out.println();
	}
	
	private void getMenuChoice() {
    System.out.print("Enter the menu choice: ");
    int choice = Integer.parseInt(keyboard.nextLine());
    displayCalculation(choice);
	}
	
	private void displayCalculation(int ch) {
		switch(ch) {
		case 1:
      System.out.print("Enter your radius: ");
      int radius = Integer.parseInt(keyboard.nextLine());
      System.out.println("Area is " + Geometry.areaCircle(radius));
			break;
		case 2:
		  System.out.print("Enter the length: ");
      int length = Integer.parseInt(keyboard.nextLine());
      System.out.print("Enter the width: ");
      int width = Integer.parseInt(keyboard.nextLine());
      System.out.println("Area is " + Geometry.areaRectangle(length, width));
			break;	
		case 3:
      System.out.print("Enter the base: ");
      int base = Integer.parseInt(keyboard.nextLine());
      System.out.print("Enter the height: ");
      int height = Integer.parseInt(keyboard.nextLine());
      System.out.println("Area is " + Geometry.areaTriangle(base, height));
			break;	
		case 4:
      System.out.print("Thank you for using the app\n");
      break;
		default:
      System.out.print("Invalid choice");
			break;
		}
	}
	
}
