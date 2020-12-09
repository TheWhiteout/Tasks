import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		int id, menu;
		double x;
		Scanner input = new Scanner(System.in);
		Account[] accounts = new Account[10];
		for (int i = 0; i < 10; i++) {
			accounts[i] = new Account(i, 100);
		}
		do {
			System.out.println("State your identity!");
			id = input.nextInt();
		} while (id > 9 || id < 0);

		while (true) {
			System.out.println("Choose life.");
			menu = input.nextInt();
			switch (menu) {
			case 1:
				System.out.println(accounts[id].getBalance());
				break;
			case 2:
				x = input.nextDouble();
				accounts[id].withdraw(x);
				break;
			case 3:
				x = input.nextDouble();
				accounts[id].deposit(x);
				break;
			case 4:
				do {
					System.out.println("State your identity!");
					id = input.nextInt();
				} while (id > 9 || id < 0);
				break;
			}
		}
	}

}
