public class ProductionWorker extends Employee {
  // Paste your ProductionWorker.java code from Ch 9 here
  public static final int DAY_SHIFT = 1;
  public static final int NIGHT_SHIFT = 2;

  private int shift;
  private double payRate;

  public ProductionWorker(String n, int num, String date, int sh,
      double rate) throws InvalidEmployeeNumber, InvalidShift, 
      InvalidPayRate {
    
        super(n, num, date);
        setShift(sh);
        setPayRate(rate);
  }

  public ProductionWorker() {
    super();
    shift = DAY_SHIFT;
    payRate = 0.0;
  }

  public void setShift(int s) throws InvalidShift {
    if (s != DAY_SHIFT && s != NIGHT_SHIFT)
      throw new InvalidShift();
    else
      shift = s;
  }

  public void setPayRate(double p) throws InvalidPayRate {
    if (p < 0)
      throw new InvalidPayRate();
    else
      payRate = p;
  }

  public int getShift() {
    return shift;
  }

  public double getPayRate() {
    return payRate;
  }

  public String toString() {
    // Call the superclass's toString() method to get the basic employee info
    String str = super.toString();
    
    // Append the shift and payRate information
    str += "Shift: ";
    if (shift == DAY_SHIFT) {
        str += "Day";
    } else if (shift == NIGHT_SHIFT) {
        str += "Night";
    } else {
        str += "Invalid Shift";
    }
    str += "\nPay Rate: $" + String.format("%.2f", payRate);
    
    return str;
}








}
