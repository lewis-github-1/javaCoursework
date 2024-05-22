class Main {
  public static void main(String[] args) {
    WirelessPackage package1 = new WirelessPackage('A', 12.5);
    WirelessPackage package2 = new WirelessPackage('B', 12.5);
    WirelessPackage package3 = new WirelessPackage('C', 12.5);

    System.out.println("Display results:");
    System.out.println("==========================================");
    System.out.println(package1.toString());
    System.out.println(package2.toString());
    System.out.println(package3.toString());


  }
}