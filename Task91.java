import java.util.Random;

public class Task91 {

	public static void main(String[] args) {
		int sum = rollDice();
		int point = 0;
		if (sum == 2 || sum == 3 || sum == 12) {
			System.out.println("You lose");
		} else if (sum == 7 || sum == 11) {
			System.out.println("You win");
		} else {
			point = sum;
			System.out.println("point is " + point);
			do {
				sum = rollDice();
			} while (point != sum && sum != 7);
			if (point == sum) {
				System.out.println("You win");
			} else {
				System.out.println("You lose");
			}
		}
	}

	public static int rollDice() {
		Random random = new Random();
		int dice1 = random.nextInt(6) + 1;
		int dice2 = random.nextInt(6) + 1;
		int sum = dice1 + dice2;
		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
		return sum;
	}
}
