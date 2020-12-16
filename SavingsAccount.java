
public class SavingsAccount extends Account {

	SavingsAccount() {
	}

	SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	public void withdraw(double x) {
		if (x > super.getBalance()) {
			System.out.println("Balance too low.");
			return;
		}

		if (x < 0) {
			System.out.println("Incorrect value.");
			return;
		}
		super.setBalance(super.getBalance() - x);
		;
	}

	public String toString() {
		return super.toString() + "\nSavings Account";
	}
}
