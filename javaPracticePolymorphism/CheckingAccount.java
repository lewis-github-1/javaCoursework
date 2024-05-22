public class CheckingAccount extends Account {

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String name, double amt) {
		super(name, amt);
	}

	public void deposit(double amt) {
		if(amt > 0) {
			this.balance += amt;
		}
	}

	public void withdraw(double amt) {
		if((this.getBalance() + 300) >= amt) {
			this.balance -= amt;
		}
	}

	public String toString() {
		String message = super.toString();
		message += "\tType: Checking";
		if(this.getBalance() < 0) {
			message += "\t** Overdrawn";
		}
		return message;
	}
	
}