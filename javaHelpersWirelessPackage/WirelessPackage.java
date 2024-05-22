public class WirelessPackage {
  private char wirelessPkg;
  private double data;

  // public constructors and methods
  public WirelessPackage(char wireless, double data) {
    this.validatePkg(wireless);
    this.validateData(data);
}

public String toString() {
  String str = "Packege: " + this.wirelessPkg;
  str += " Subtotal: " + this.money(this.subTotal());
  str += " Tax: " + this.money(this.tax());
  str += " Total: " + this.money(this.total());
  return str;
}

  // private helper methods
  private void validatePkg(char pack) {
    if (pack == 'A' || pack == 'B' || pack == 'C') {
      this.wirelessPkg = pack;
    } else {
      this.wirelessPkg = 'A';
    }

  }

  private void validateData(double value) {
    if (value > 0) {
      this.data = value;
    } else {
      this.data = 0;
    }
 
  }
      
  private double subTotal() { 
    double price = 0;
    switch (wirelessPkg) {
      case 'A':
        price = 29.99;
        break;
      case 'B':
        price = 39.99;
        break;
      case 'C':
        price = 59.99;
        break;
      default:
        price = 29.99;
    }
      return price + this.extraData();
  }

  private double tax() {
    return this.subTotal() * .09;
  }

  private double total() {
    return this.subTotal() + this.tax();
  }

  private double extraData() {
    if (this.wirelessPkg == 'A' && this.data > 5) {
      return (Math.ceil(this.data) - 5) * 10;
    } else if (this.wirelessPkg == 'B' && this.data > 10) {
      return (Math.ceil(this.data) - 10) * 10;
    } else {
      return 0;
    }
  }
  
  private String money(double amt) {
    return String.format("$%,.2f", amt); 
  }

}