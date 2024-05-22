public class Account {
	private String name;
	protected double balance;

	public Account() {
		this.name = "No name";
		this.balance = 0;
	}

	public Account(String name, double amt) {
		this.name = name;
		this.balance = amt;
	}

	public String getName() { return this.name;}
	public double getBalance() { return this.balance;}
	public void deposit(double amt) {this.balance += amt; }
	public void withdraw(double amt) {this.balance -= amt; }

	public String toString() {
		String message = String.format("Name: %-10s\tBalance:\t$%6.2f", this.name, this.balance);
		return message;
	}	
}