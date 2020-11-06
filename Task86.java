import java.lang.reflect.Array;

public class Task86 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
		int size1 = Array.getLength(matrix);
		int size2 = Array.getLength(matrix[0]);
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
