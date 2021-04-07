package by.jonline.arraysOfArrays;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int[][] a = { { 5, 2, 6, 8 }, { 1, 2, 7, 2 }, { 3, 2, 10, 7 }, { 4, 2, 3, 6 } };
		Scanner input = new Scanner(System.in);

		System.out.println("Введите номер строки для вывода");

		int k = input.nextInt();

		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[k][i]);
		}
		System.out.println();
		System.out.println("Введите номер столбца для вывода");
		int p = input.nextInt();
		input.close();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i][p]);
		}

	}

}
