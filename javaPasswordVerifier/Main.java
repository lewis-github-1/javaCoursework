import java.util.Scanner;

class Main {  
  public static void main(String[] args) {
    // These 2 lines clear the terminal between runs:
    System.out.print("\033[H\033[2J");
    System.out.flush();

    Scanner scan = new Scanner(System.in);
    String password;
    boolean isValidPassword;

    do {
    System.out.print("Please enter a password: ");
    password = scan.nextLine();
    isValidPassword = PasswordVerifier.isValid(password);
    System.out.println();
    } while (!isValidPassword);
    
    scan.close();
	  }    
};
