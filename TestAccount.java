
public class TestAccount {

	public static void main(String[] args) {
		Account a0001 = new Account(1122, 20000);
		Account.setYearInterestRate(4.5);
		a0001.withdraw(2500);
		a0001.deposit(3000);
		System.out.println(a0001.getBalance());
		System.out.println(a0001.getMonthlyInterest());
		System.out.println(a0001.getDateCreated());
	}

}
