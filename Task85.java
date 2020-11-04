import java.util.Scanner;

public class Task85 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[][] input = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				input[i][j] = reader.nextInt();
			}
			System.out.println();
		}
		int max = input[0][0] + input[0][1] + input[0][2] + input[0][3] + input[0][4];
		int maxLine = 0;
		for (int i = 1; i < 5; i++) {
			if (max < (input[i][0] + input[i][1] + input[i][2] + input[i][3] + input[i][4])) {
				max = input[i][0] + input[i][1] + input[i][2] + input[i][3] + input[i][4];
				maxLine = i;
			}
		}
		System.out.println(maxLine);
	}

}
