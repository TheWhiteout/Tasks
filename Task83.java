import java.util.Scanner;

public class Task83 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] input = new int[10];
		int[] sequence = new int[10];
		for (int i = 0; i < 10; i++) {
			input[i] = reader.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (i != 9) {
				sequence[i] = input[i + 1];
			} else {
				sequence[i] = input[0];
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(sequence[i]);
		}
	}
}
