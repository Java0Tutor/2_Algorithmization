package by.jonline.arraysOfArrays;

public class Task2 {

	public static void main(String[] args) {
		int[][] a = { { 5, 2, 6, 8 }, { 1, 2, 7, 2 }, { 3, 2, 10, 7 }, { 4, 2, 3, 6 } };

		for (int i = 0, j = 0; i < a.length; i++, j++) {
			System.out.println(a[i][j]);
		}
	}

}
