
public class CheckingAccount extends Account {

	private static final double overdraftLimit = 1000;

	CheckingAccount() {
	}

	CheckingAccount(int id, double balance) {
		super(id, balance);
	}

	public void withdraw(double x) {
		if (x > super.getBalance() + overdraftLimit) {
			System.out.println("Balance too low.");
			return;
		}

		if (x < 0) {
			System.out.println("Incorrect value.");
			return;
		}
		super.setBalance(super.getBalance() - x);
	}

	public String toString() {
		return super.toString() + "\nChecking Account";
	}
}
