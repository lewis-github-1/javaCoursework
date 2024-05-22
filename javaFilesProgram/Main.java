import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

class Main {
  public static void main(String[] args) throws IOException {

    Account account1 = new Account("John Doe", 100.00);

    // Read deposits
    File dep = new File("deposits.txt");
    Scanner inputDep = new Scanner(dep);

    System.out.println("Printing deposits: ");
    System.out.println("====================================================");
    
    while (inputDep.hasNextLine()) {
      String dataDep = inputDep.nextLine();
      account1.deposit(Double.parseDouble(dataDep));
      dataDep = String.format("%7s", dataDep);
      System.out.println("Deposited: $" + dataDep + account1.toString());
    }
    
    inputDep.close();
    // Read withdrawals
    File wit = new File("withdrawals.txt");
    Scanner inputWith = new Scanner(wit);

    System.out.println("\n\nPrinting withdrawals: ");
    System.out.println("====================================================");
    
    while (inputWith.hasNextLine()) {
      String dataWith = inputWith.nextLine();
      account1.withdraw(Double.parseDouble(dataWith));
      dataWith = String.format("%7s", dataWith);
      System.out.println("Withdrew: $" + dataWith + account1.toString());
    }
    
    inputWith.close();
  }
  
}