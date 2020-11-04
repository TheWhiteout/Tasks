import java.util.Random;

public class Task81 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] randomArray = new int[20];
		for (int i = 0; i < 20; i++) {
			randomArray[i] = random.nextInt();
			System.out.println(randomArray[i]);
		}
	}

}
