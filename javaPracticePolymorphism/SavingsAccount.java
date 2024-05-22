public class SavingsAccount extends Account {

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String name, double amt) {
		super(name, amt);
	}

	public void deposit(double amt) {
		if(amt > 0) {
			this.balance += amt;
		}
	}

	public void withdraw(double amt) {
		if(this.getBalance() >= amt) {
			this.balance -= amt;
		}
	}

	public String toString() {
		String message = super.toString();
		message += "\tType: Savings";
		return message;
	}
	
}