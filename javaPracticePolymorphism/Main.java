import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
		// These 2 lines clear the terminal between runs:
		System.out.print("\033[H\033[2J");
		System.out.flush();

		// Put your code below here:

		ArrayList<Account> accts = new ArrayList<Account>();

		SavingsAccount sa1 = new SavingsAccount("John Doe", 100);
		SavingsAccount sa2 = new SavingsAccount("Jane Doe", 200);

		CheckingAccount ca1 = new CheckingAccount("Bob Brown", 100);
		CheckingAccount ca2 = new CheckingAccount("Bill Black", 200);

		// Task 1) Add the accounts to the ArrayList
		accts.add(sa1);
		accts.add(sa2);
		accts.add(ca1);
		accts.add(ca2);


		// Task 2) Print out the accounts
		System.out.println("\n\nBefore any transactions:");
		for (Account a : accts) {
			System.out.println(a);
		}

		// Task 3) deposit $100 into each account
		sa1.deposit(100);				// Two different ways of depositing. 1 through the object, 1 through the arraylist.
		sa2.deposit(100);
		accts.get(2).deposit(100);
		accts.get(3).deposit(100);


		// Task 4) print out the accounts again
		System.out.println("\n\nAfter deposits:");
		for (Account a : accts) {
			System.out.println(a);
		}

		// Task 5) make a withdrawal from each account
		accts.get(0).withdraw(250);
		accts.get(1).withdraw(25);
		accts.get(2).withdraw(250);
		accts.get(3).withdraw(50);


		// Task 6) print out the accounts again
		System.out.println("\n\nAfter withdrawals:");
		for (Account a : accts) {
			System.out.println(a);
		}

		// Task 7) find and print who has the largest balance
		Account highestAccount = accts.get(0);
		double highestBalance = highestAccount.getBalance();

		for (Account a: accts) {
			if (a.getBalance() > highestBalance) {
				highestAccount = a;
				highestBalance = a.getBalance();
			}
		}

		System.out.println("\n\nAccount with highest balance: ");
		System.out.println(highestAccount);


		
	}
}
