import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;
import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// Write 100 random numbers between 1 and 100 to a file
    PrintWriter printOut = new PrintWriter("Random.txt");
    Random random = new Random();
    int number;

    for (int ctr = 0; ctr < 100; ctr++) {
      number = random.nextInt(100) + 1;
      printOut.println(number);
    }

    printOut.close();

		// Read each number from the file and process the
		// highest, lowest, total, and average of the numbers
    File file = new File("Random.txt");
    Scanner inputFile = new Scanner(file);

    int total = 0, count = 0, highest = 0, lowest = 100, numberRead;
    while(inputFile.hasNext()) {
      numberRead = Integer.parseInt(inputFile.nextLine());
      total += numberRead;
      count++;
      if (numberRead > highest) {
        highest = numberRead;            
      }
      if (numberRead < lowest) {
        lowest = numberRead;
      }
    }

    inputFile.close();
    
		// Output statistics
    System.out.println("\n\nPrinting statistics:\n===================================");
    System.out.println("The lowest is " + lowest);
    System.out.println("The highest is " + highest);
    System.out.println("The total is: " + total);
    System.out.println("The average is " + ((double)total / count));
    
	}
}


