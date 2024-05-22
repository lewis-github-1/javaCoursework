class Main {
  public static void main(String[] args) {
    // These 2 lines clear the terminal between runs:
    System.out.print("\033[H\033[2J");
    System.out.flush();

    // your WorkerDemo code will go in this file
    ProductionWorker pw = new ProductionWorker("John Smith", "123-A",
                      "4-15-2011", ProductionWorker.DAY_SHIFT, 26.50);

    System.out.println("Here's the first production worker.");
    System.out.println(pw);

    ProductionWorker pw2 = new ProductionWorker();
    pw2.setName("Joan Jones");
    pw2.setEmployeeNumber("222-L");
    pw2.setHireDate("3-12-2011");
    pw2.setShift(ProductionWorker.NIGHT_SHIFT);
    pw2.setPayRate(28.50);

    System.out.println("\nHere's the second production worker.");
    System.out.println(pw2);

  }
}
