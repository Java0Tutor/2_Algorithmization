package by.jonline.arraysOfArrays;

public class Task1 {

	public static void main(String[] args) {
		int[][] a = { { 5, 2, 6, 8, 1 }, { 1, 2, 7, 8, 2 }, { 3, 2, 10, 8, 3 }, { 4, 2, 3, 8, 4 } };

		for (int j = 0, i = 0; j < a[i].length; j += 2) {
			if (a[0][j] > a[a.length - 1][j]) {
				System.out.println("Столбец " + j);
				for (int k = 0; k < a.length; k++) {
					System.out.println(a[k][j]);
				}
			}
		}
	}
}
