import java.util.Random;

public class Task84 {

	public static void main(String[] args) {
		int[][] sequence = new int[4][2];
		Random random = new Random();
		for (int i = 0; i < 4; i++) {
			sequence[i][0] = random.nextInt(13) + 2;
			sequence[i][1] = random.nextInt(4);
			if (i != 0) {
				for (int j = 0; j < i; j++) {
					if (sequence[i][0] == sequence[j][0] && sequence[i][1] == sequence[j][1]) {
						i--;
						break;
					}
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			if (sequence[i][0] > 10) {
				switch (sequence[i][0]) {
				case 11:
					System.out.print("J");
					break;
				case 12:
					System.out.print("Q");
					break;
				case 13:
					System.out.print("K");
					break;
				case 14:
					System.out.print("A");
					break;
				}
			} else {
				System.out.print(sequence[i][0]);
			}
			switch (sequence[i][1]) {
			case 0:
				System.out.print(" of diamonds");
				break;
			case 1:
				System.out.print(" of hearts");
				break;
			case 2:
				System.out.print(" of spades");
				break;
			case 3:
				System.out.print(" of clubs");
				break;
			}
			System.out.println();
		}
	}

}
