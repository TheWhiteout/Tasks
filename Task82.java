import java.util.Random;
import java.util.Scanner;

public class Task82 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random random = new Random();
		int[] input = new int[10];
		int[] sequence = new int[10];
		for (int i = 0; i < 10; i++) {
			input[i] = reader.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			int number = random.nextInt(10);
			sequence[i] = input[number];
			if (i != 0) {
				for (int j = 0; j < i; j++) {
					if (sequence[i] == sequence[j]) {
						i--;
						break;
					}
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(sequence[i]);
		}
	}

}
