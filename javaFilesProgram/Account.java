import java.util.Scanner; 

public class Account {
  private String name;
  private double balance;

  public Account(String nm, double bal) {
    this.name = nm;
    this.balance = bal;
  }

  public String getName() {
    return this.name;      
  }

  public double getBalance() {
    return this.balance;
  }

  public void deposit(double dep) {
    if (dep > 0) {
      this.balance += dep;
    }
  }

  public void withdraw(double wit) {
    if (wit <= this.balance) {
      this.balance -= wit;
    }

  }

  private String money(double amt) {
    return String.format("%6s", amt); 
  }

  public String toString() {
    String str = String.format("%10s...Balance: $%8.2f", getName(), getBalance());
    return str;
  }
  
  
}