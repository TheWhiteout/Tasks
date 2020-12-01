
public class AccountTest {

	public static void main(String[] args) {
		SavingsAccount sa0001 = new SavingsAccount();
		sa0001.name = "Geralt";
		sa0001.deposit(1000.0);
		sa0001.withdraw(777.77);
		System.out.println((int) (sa0001.balance * 100) / 100.0);
	}

}
