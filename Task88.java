
public class Task88 {

	public static void main(String[] args) {
		int[][] grid1 = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
		int[][] grid = { { 4, 3, 5, 2, 6, 9, 7, 8, 1 }, { 6, 8, 2, 5, 7, 1, 4, 9, 3 }, { 1, 9, 7, 8, 3, 4, 5, 6, 2 },
				{ 8, 2, 6, 1, 9, 5, 3, 4, 7 }, { 3, 7, 4, 6, 8, 2, 9, 1, 5 }, { 9, 5, 1, 7, 4, 3, 6, 2, 8 },
				{ 5, 1, 9, 3, 2, 6, 8, 7, 4 }, { 2, 4, 8, 9, 5, 7, 1, 3, 6 }, { 7, 6, 3, 4, 1, 8, 2, 5, 9 } };
		int[][] cell = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (grid[i][j] < 1 || grid[i][j] > 9) {
					System.out.println("No.");
					return;
				}
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j != 0) {
					for (int k = 0; k < j; k++) {
						if (grid[i][j] == grid[i][k]) {
							System.out.println("No.");
							return;
						}
					}
				}
			}
		}
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 9; i++) {
				if (i != 0) {
					for (int k = 0; k < i; k++) {
						if (grid[i][j] == grid[k][j]) {
							System.out.println("No.");
							return;
						}
					}
				}
			}
		}
		int row = 0;
		int column = 0;
		for (int i = 0; i < 9; i++) {
			if (i > 0 && i % 3 == 0) {
				row += 3;
				column=0;
			}
			for (int j = 0; j < 9; j++) {
				if (j < 3) {
					cell[i][j] = grid[row][j + column];
				} else if (j < 6) {
					cell[i][j] = grid[row + 1][j + column - 3];
				} else {
					cell[i][j] = grid[row + 2][j + column - 6];
				}

			}
			column += 3;

		}
		System.out.println("Yes.");
	}

}
