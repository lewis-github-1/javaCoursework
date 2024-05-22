public class Main {
  public static void main(String[] args) {
    createWorker("John Smith", 123, "11-15-2009",
                  ProductionWorker.DAY_SHIFT, 16.50);
  

    System.out.println();
    System.out.println("Attempting an invalid employee number... ");
    createWorker("John Smith", 10001, "11-15-2009", ProductionWorker.DAY_SHIFT, 16.50);

    System.out.println();
    System.out.println("Attempting an invalid shift number...");
    createWorker("John Smith", 123, "11-15-2009", 66, 16.50);

    System.out.println();
    System.out.println("Attempting a negative pay rate...");
    createWorker("John Smith", 123, "11-15-2009", 
                  ProductionWorker.DAY_SHIFT, -99.00);

  }



  public static void createWorker(String n, int num, String date,
                                 int sh, double rate){
        
    ProductionWorker pw;
    try {
      pw = new ProductionWorker(n, num, date, sh, rate);

      System.out.println("Object created.");
      System.out.println(pw);
    }
    catch (InvalidEmployeeNumber e) {
      System.out.println(e.getMessage());
    }
    catch (InvalidShift e) {
      System.out.println(e.getMessage());
    }
    catch (InvalidPayRate e) {
      System.out.println(e.getMessage());
    }
}

}
