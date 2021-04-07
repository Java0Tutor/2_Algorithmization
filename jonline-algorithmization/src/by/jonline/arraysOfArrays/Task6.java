package by.jonline.arraysOfArrays;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Введите порядок квадратной матрицы n");
		int n = input.nextInt();
		input.close();
		int[][] a = new int[n][n];

		for (int i = 0, k = 0; i < a.length; i++, k++) {
			for (int j = k; j < a.length - k; j++) {
				a[i][j] = 1;
				a[a.length - i-1][a.length - j-1] = 1;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a.length; j++) {
				System.out.print(" " + a[i][j]);
			}
		}
	}

}
