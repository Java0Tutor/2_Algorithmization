package by.jonline.onedimarrays;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Введите Z");
		int z = input.nextInt();
		input.close();
		int[] a = { 5, 6, 4, 1, 7, 6, 9, 3, 5, 7, 2, 3, 21, 42, 36, 54, 15, 35 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				a[i] = z;
				count++;
			}
		}
		System.out.println("Число замен = " + count);
	}
}
