public class Employee {
	private String firstName;
	private String lastName;
	private double hours;
	private double rate;
	
	public Employee(String fn, String ln, double hrs, double rt) {
		this.firstName = fn;
		this.lastName = ln;
		validateHours(hrs);
    validateRate(rt); 
	}
	
	public double getNetPay() {
		return this.getGrossPay() - this.fedTax() - this.stateTax() - this.ssTax();
	}
	
	public double getGrossPay() {
		return this.hours * this.rate;
	}
	
	public String toString() {
		String str = this.firstName + " " + this.lastName;
		str += " earned " + money(this.getGrossPay()) + " gross";
		str += " and " + money(this.getNetPay()) + " net\n";
		return str;
	}

	// private helper methods
  private void validateHours(double amt) {
    if (amt > 0 && amt < 41) {
      this.hours = amt;
    } else {
      this.hours = 0;
    }
  }

  private void validateRate(double amt) {
    if (amt >= 8.25 && amt <= 15) {
      this.rate = amt;
    } else {
      this.rate = 0;
    }
  }

  private double fedTax() {
    return this.getGrossPay() * .15;
  }

  private double stateTax() {
    return this.getGrossPay() * .0495;
  }

  private double ssTax() {
    return this.getGrossPay() * .0725;
  }

  private String money(double amt) {
    return String.format("$%.2f", amt);
  }

  
}

