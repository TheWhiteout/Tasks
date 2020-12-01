import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private static double yearInterestRate = 0;
	private Date dateCreated = new Date();

	Account() {
	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	void setId(int id) {
		this.id = id;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	static void setYearInterestRate(double yearInterestRate) {
		Account.yearInterestRate = yearInterestRate;
	}

	int getId() {
		return id;
	}

	double getBalance() {
		return balance;
	}

	double getYearInterestRate() {
		return Account.yearInterestRate;
	}

	Date getDateCreated() {
		return dateCreated;
	}

	static double getMonthlyInterestRate() {
		return Account.yearInterestRate / 12;
	}

	double getMonthlyInterest() {
		return balance * Account.getMonthlyInterestRate() / 100;
	}

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
