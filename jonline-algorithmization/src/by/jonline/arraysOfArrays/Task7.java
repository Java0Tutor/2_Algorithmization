package by.jonline.arraysOfArrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Введите порядок квадратной матрицы n");
		int n = input.nextInt();
		input.close();
		double[][] a = new double[n][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / 10);
			}
		}
		DecimalFormat df = new DecimalFormat("#0.000");

		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a.length; j++) {
				System.out.printf(df.format(a[i][j]) + "\t");
			}
		}
	}

}
