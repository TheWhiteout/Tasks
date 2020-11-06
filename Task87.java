import java.util.Scanner;

public class Task87 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char[] answerKey = new char[10];
		char[][] studentAnswers = new char[8][10];
		int[] results = new int[8];
		for (int i = 0; i < 10; i++) {
			answerKey[i] = reader.next().charAt(0);
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 10; j++) {
				studentAnswers[i][j] = reader.next().charAt(0);
			}
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 10; j++) {
				if (studentAnswers[i][j] == answerKey[j]) {
					results[i]++;
				}
			}
		}
		for (int i = 0; i < 8; i++) {
				System.out.println(results[i]);
		}
	}

}
