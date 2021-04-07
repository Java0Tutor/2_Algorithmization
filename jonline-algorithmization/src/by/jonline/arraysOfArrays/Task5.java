package by.jonline.arraysOfArrays;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Введите порядок квадратной матрицы n");
		int n = input.nextInt();
		input.close();
		int[][] a = new int[n][n];

		for (int i = 0, k = a.length; i < a.length; i++, k--) {
			for (int j = 0; j < k; j++) {
				a[j][i] = j + 1;

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
