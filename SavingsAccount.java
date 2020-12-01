
public class SavingsAccount {
	public String name;
	public double balance;

	public void deposit(double x) {
		balance += x;
	}

	public void withdraw(double x) {
		if (x > balance) {
			System.out.println("Balance too low.");
			return;
		}
		if (x < 0) {
			System.out.println("Incorrect value.");
			return;
		}
		balance -= x;
	}
}
