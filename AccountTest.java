
public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(1, 10000);
		SavingsAccount savings = new SavingsAccount(2, 5000);
		CheckingAccount checking = new CheckingAccount(3, 1000);
		System.out.println(account.toString());
		System.out.println();
		System.out.println(savings.toString());
		System.out.println();
		System.out.println(checking.toString());
		System.out.println();
		savings.withdraw(-1);
		savings.withdraw(5000);
		savings.withdraw(1);
		checking.withdraw(-1);
		checking.withdraw(1000);
		checking.withdraw(1000);
		checking.withdraw(1);
	}

}
